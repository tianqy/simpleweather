package com.example.zuoxy.simpleweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zuoxy on 2017/4/27.
 */

public class County extends DataSupport {

    private int _id;
    private String countNane;
    private String weatherId;
    private int cityId;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getCountNane() {
        return countNane;
    }

    public void setCountNane(String countNane) {
        this.countNane = countNane;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
