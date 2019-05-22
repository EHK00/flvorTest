package com.inicis.ekh.daggertest;

import dagger.Component;

@Component(modules = SampleModule.class)
public interface SampleComponent {
    void inject(MainActivity mainActivity);
}

