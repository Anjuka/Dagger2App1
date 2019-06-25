package com.auxtest.dagger2app1;

import android.app.Application;

public class EggsApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .refrigiratorModule(new RefrigiratorModule())
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
