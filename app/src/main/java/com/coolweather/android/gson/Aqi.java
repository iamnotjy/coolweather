package com.coolweather.android.gson;

/**
 * Created by Administrator on 2017/3/16.
 */

public class Aqi {

    public aqiCity city;

    public class aqiCity{
        public String aqi;
        public String co;
        public String no2;
        public String o3;
        public String pm10;
        public String pm25;
        public String qlty;
        public String so2;
    }
}
