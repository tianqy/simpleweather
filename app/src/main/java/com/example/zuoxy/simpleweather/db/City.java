package com.example.zuoxy.simpleweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zuoxy on 2017/4/27.
 */

public class City extends DataSupport {

    private int _id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}