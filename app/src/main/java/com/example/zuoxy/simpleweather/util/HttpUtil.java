package com.example.zuoxy.simpleweather.util;


import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by zuoxy on 2017/4/27.
 */

public class HttpUtil {

    //发起HTTP请求
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }
}
