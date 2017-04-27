package com.example.zuoxy.simpleweather.gson;

/**
 * Created by zuoxy on 2017/4/27.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
