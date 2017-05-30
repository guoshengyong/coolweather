package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by king on 2017/5/30.
 */

public class Now {
    @SerializedName("tmp")
    public String tmperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
