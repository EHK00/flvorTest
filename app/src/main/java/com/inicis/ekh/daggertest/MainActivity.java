package com.inicis.ekh.daggertest;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

public class MainActivity extends AppCompatActivity {

    @Inject
    Owner owner;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SampleComponent sampleComponent = DaggerSampleComponent.builder()
                .sampleModule(new SampleModule())
                .build();

        sampleComponent.inject(this);
        String name = owner.getPetName();
        Log.d("TEST", name);

    }
}
