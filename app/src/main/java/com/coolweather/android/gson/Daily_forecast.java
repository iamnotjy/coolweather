package com.coolweather.android.gson;

/**
 * Created by Administrator on 2017/3/16.
 */

public class Daily_forecast {

    public astroP astro;
    public class astroP{
        public String mr;
        public String ms;
        public String sr;
        public String ss;
    }

    public condP cond;
    public class condP{
        public String code_d;
        public String code_n;
        public String txt_d;
        public String txt_n;

    }

    public String date;

    public String hum;

    public String pcpn;

    public String pop;

    public String pres;

    public tmpP tmp;
    public class tmpP{
        public String max;
        public String min;
    }

    public String uv;

    public String vis;


    public windP win;
    public class windP{
        public String deg;
        public String dir;
        public String sc;
        public String spd;
    }

}
