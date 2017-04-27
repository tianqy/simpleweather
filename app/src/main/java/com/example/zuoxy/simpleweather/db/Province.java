package com.example.zuoxy.simpleweather.db;

import org.litepal.crud.DataSupport;


/**
 * Created by zuoxy on 2017/4/27.
 */

public class Province extends DataSupport{

    private int id;    //编号
    private String provinceName;    //省名
    private int provinceCode;   //省份代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }



}
