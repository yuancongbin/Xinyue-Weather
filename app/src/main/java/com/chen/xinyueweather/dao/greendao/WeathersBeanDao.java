package com.chen.xinyueweather.dao.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.chen.xinyueweather.dao.bean.WeathersBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "WEATHERS_BEAN".
*/
public class WeathersBeanDao extends AbstractDao<WeathersBean, Void> {

    public static final String TABLENAME = "WEATHERS_BEAN";

    /**
     * Properties of entity WeathersBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property AreaId = new Property(0, String.class, "areaId", false, "AREA_ID");
        public final static Property Date = new Property(1, String.class, "date", false, "DATE");
        public final static Property Img = new Property(2, String.class, "img", false, "IMG");
        public final static Property Sun_down_time = new Property(3, String.class, "sun_down_time", false, "SUN_DOWN_TIME");
        public final static Property Sun_rise_time = new Property(4, String.class, "sun_rise_time", false, "SUN_RISE_TIME");
        public final static Property Temp_day_c = new Property(5, String.class, "temp_day_c", false, "TEMP_DAY_C");
        public final static Property Temp_day_f = new Property(6, String.class, "temp_day_f", false, "TEMP_DAY_F");
        public final static Property Temp_night_c = new Property(7, String.class, "temp_night_c", false, "TEMP_NIGHT_C");
        public final static Property Temp_night_f = new Property(8, String.class, "temp_night_f", false, "TEMP_NIGHT_F");
        public final static Property Wd = new Property(9, String.class, "wd", false, "WD");
        public final static Property Weather = new Property(10, String.class, "weather", false, "WEATHER");
        public final static Property Week = new Property(11, String.class, "week", false, "WEEK");
        public final static Property Ws = new Property(12, String.class, "ws", false, "WS");
    }


    public WeathersBeanDao(DaoConfig config) {
        super(config);
    }
    
    public WeathersBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"WEATHERS_BEAN\" (" + //
                "\"AREA_ID\" TEXT," + // 0: areaId
                "\"DATE\" TEXT," + // 1: date
                "\"IMG\" TEXT," + // 2: img
                "\"SUN_DOWN_TIME\" TEXT," + // 3: sun_down_time
                "\"SUN_RISE_TIME\" TEXT," + // 4: sun_rise_time
                "\"TEMP_DAY_C\" TEXT," + // 5: temp_day_c
                "\"TEMP_DAY_F\" TEXT," + // 6: temp_day_f
                "\"TEMP_NIGHT_C\" TEXT," + // 7: temp_night_c
                "\"TEMP_NIGHT_F\" TEXT," + // 8: temp_night_f
                "\"WD\" TEXT," + // 9: wd
                "\"WEATHER\" TEXT," + // 10: weather
                "\"WEEK\" TEXT," + // 11: week
                "\"WS\" TEXT);"); // 12: ws
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"WEATHERS_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, WeathersBean entity) {
        stmt.clearBindings();
 
        String areaId = entity.getAreaId();
        if (areaId != null) {
            stmt.bindString(1, areaId);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(2, date);
        }
 
        String img = entity.getImg();
        if (img != null) {
            stmt.bindString(3, img);
        }
 
        String sun_down_time = entity.getSun_down_time();
        if (sun_down_time != null) {
            stmt.bindString(4, sun_down_time);
        }
 
        String sun_rise_time = entity.getSun_rise_time();
        if (sun_rise_time != null) {
            stmt.bindString(5, sun_rise_time);
        }
 
        String temp_day_c = entity.getTemp_day_c();
        if (temp_day_c != null) {
            stmt.bindString(6, temp_day_c);
        }
 
        String temp_day_f = entity.getTemp_day_f();
        if (temp_day_f != null) {
            stmt.bindString(7, temp_day_f);
        }
 
        String temp_night_c = entity.getTemp_night_c();
        if (temp_night_c != null) {
            stmt.bindString(8, temp_night_c);
        }
 
        String temp_night_f = entity.getTemp_night_f();
        if (temp_night_f != null) {
            stmt.bindString(9, temp_night_f);
        }
 
        String wd = entity.getWd();
        if (wd != null) {
            stmt.bindString(10, wd);
        }
 
        String weather = entity.getWeather();
        if (weather != null) {
            stmt.bindString(11, weather);
        }
 
        String week = entity.getWeek();
        if (week != null) {
            stmt.bindString(12, week);
        }
 
        String ws = entity.getWs();
        if (ws != null) {
            stmt.bindString(13, ws);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, WeathersBean entity) {
        stmt.clearBindings();
 
        String areaId = entity.getAreaId();
        if (areaId != null) {
            stmt.bindString(1, areaId);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(2, date);
        }
 
        String img = entity.getImg();
        if (img != null) {
            stmt.bindString(3, img);
        }
 
        String sun_down_time = entity.getSun_down_time();
        if (sun_down_time != null) {
            stmt.bindString(4, sun_down_time);
        }
 
        String sun_rise_time = entity.getSun_rise_time();
        if (sun_rise_time != null) {
            stmt.bindString(5, sun_rise_time);
        }
 
        String temp_day_c = entity.getTemp_day_c();
        if (temp_day_c != null) {
            stmt.bindString(6, temp_day_c);
        }
 
        String temp_day_f = entity.getTemp_day_f();
        if (temp_day_f != null) {
            stmt.bindString(7, temp_day_f);
        }
 
        String temp_night_c = entity.getTemp_night_c();
        if (temp_night_c != null) {
            stmt.bindString(8, temp_night_c);
        }
 
        String temp_night_f = entity.getTemp_night_f();
        if (temp_night_f != null) {
            stmt.bindString(9, temp_night_f);
        }
 
        String wd = entity.getWd();
        if (wd != null) {
            stmt.bindString(10, wd);
        }
 
        String weather = entity.getWeather();
        if (weather != null) {
            stmt.bindString(11, weather);
        }
 
        String week = entity.getWeek();
        if (week != null) {
            stmt.bindString(12, week);
        }
 
        String ws = entity.getWs();
        if (ws != null) {
            stmt.bindString(13, ws);
        }
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public WeathersBean readEntity(Cursor cursor, int offset) {
        WeathersBean entity = new WeathersBean( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // areaId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // date
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // img
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // sun_down_time
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // sun_rise_time
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // temp_day_c
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // temp_day_f
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // temp_night_c
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // temp_night_f
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // wd
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // weather
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // week
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12) // ws
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, WeathersBean entity, int offset) {
        entity.setAreaId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setDate(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setImg(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSun_down_time(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setSun_rise_time(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTemp_day_c(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setTemp_day_f(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setTemp_night_c(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setTemp_night_f(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setWd(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setWeather(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setWeek(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setWs(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(WeathersBean entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(WeathersBean entity) {
        return null;
    }

    @Override
    public boolean hasKey(WeathersBean entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
