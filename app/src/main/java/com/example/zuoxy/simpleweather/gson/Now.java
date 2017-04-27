package com.example.zuoxy.simpleweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zuoxy on 2017/4/27.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
