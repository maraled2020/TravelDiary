package com.khodadadi.delaram.traveldiary;

import android.app.Application;

import com.google.inject.Stage;

import roboguice.RoboGuice;

/**
 * Created by hostova1 on 30/09/2014.
 */
public class TravelDiaryApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Stage stage = BuildConfig.DEBUG ? Stage.DEVELOPMENT : Stage.PRODUCTION;
        RoboGuice.setBaseApplicationInjector(this, stage, RoboGuice.newDefaultRoboModule
                (this), new TravelDiaryModule(this));
    }
}
