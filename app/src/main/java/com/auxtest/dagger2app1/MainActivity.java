package com.auxtest.dagger2app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    String eggs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((EggsApplication) getApplication())
                .getAppComponent()
                .inject(this);

       // System.out.println("Eggs : " + eggs);

    }
}
