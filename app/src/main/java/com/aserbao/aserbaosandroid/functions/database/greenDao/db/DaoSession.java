package com.aserbao.aserbaosandroid.functions.database.greenDao.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.aserbao.aserbaosandroid.functions.database.greenDao.beans.Thing;

import com.aserbao.aserbaosandroid.functions.database.greenDao.db.ThingDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig thingDaoConfig;

    private final ThingDao thingDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        thingDaoConfig = daoConfigMap.get(ThingDao.class).clone();
        thingDaoConfig.initIdentityScope(type);

        thingDao = new ThingDao(thingDaoConfig, this);

        registerDao(Thing.class, thingDao);
    }
    
    public void clear() {
        thingDaoConfig.clearIdentityScope();
    }

    public ThingDao getThingDao() {
        return thingDao;
    }

}
