package com.coolweather.android.gson;

/**
 * Created by Administrator on 2017/3/16.
 */

public class Hourly_forecast {

    public condP cond;
    public class condP{
        public int code;
        public String txt;
    }

    public String date;

    public int hum;

    public int pop;

    public int pres;

    public int tmp;

    public windP wind;
    public class windP{
        public int deg;
        public String dir;
        public String sc;
        public int spd;
    }

}
