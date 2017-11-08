package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by adm on 2017/11/8.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int proviceCode;

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProviceCode(int proviceCode) {
        this.proviceCode = proviceCode;
    }

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProviceCode() {
        return proviceCode;
    }



}
