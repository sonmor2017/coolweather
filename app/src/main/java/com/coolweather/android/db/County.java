package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by adm on 2017/11/8.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private int cityId;
    private int weathrId;

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public int getCityId() {
        return cityId;
    }

    public int getWeathrId() {
        return weathrId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setWeathrId(int weathrId) {
        this.weathrId = weathrId;
    }
}
