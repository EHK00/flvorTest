package com.inicis.ekh.daggertest;


import dagger.Module;
import dagger.Provides;

@Module
public class SampleModule {
    @Provides
    Pet providePet(){
        return new Dog();
    }
}
