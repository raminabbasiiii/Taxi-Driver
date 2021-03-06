package com.example.ramin.driver;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class CustomFont extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/vazir.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
