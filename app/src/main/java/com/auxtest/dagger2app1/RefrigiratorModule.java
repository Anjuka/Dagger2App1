package com.auxtest.dagger2app1;

import dagger.Module;
import dagger.Provides;

@Module
public class RefrigiratorModule {

    public RefrigiratorModule() {

    }

    @Provides
    String provideEggs(){
        return "2 eggs";
    }
}
