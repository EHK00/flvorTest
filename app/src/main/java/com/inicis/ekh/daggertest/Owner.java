package com.inicis.ekh.daggertest;

import javax.inject.Inject;

public class Owner {
    private Pet pet;

    @Inject
    public Owner(Pet pet){
        this.pet = pet;
    }

    public String getPetName(){
        return pet.getName();
    }
}
