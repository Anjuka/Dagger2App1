package com.auxtest.dagger2app1;

import dagger.Component;

@Component(modules = RefrigiratorModule.class)
public interface AppComponent {

    void inject(MainActivity mainActivity);
}
