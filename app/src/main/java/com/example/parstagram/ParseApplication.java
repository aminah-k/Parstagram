package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("GUBu7wzRuHSDyJPlqFEawEGQ27eTDBQpeGguKVFL")
                .clientKey("hT09PWmLecowGGtiCsGDaW3gBzuiw8aVxai7rwRo")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
