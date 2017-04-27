package com.example.zuoxy.simpleweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zuoxy on 2017/4/27.
 */

public class Basic {
    @SerializedName("city")     //让JSON字段和Java字段之间建立联系
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
