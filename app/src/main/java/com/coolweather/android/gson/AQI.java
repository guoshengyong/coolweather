package com.coolweather.android.gson;

/**
 * Created by king on 2017/5/30.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
