package com.example.andriod.tourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Overv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overv);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new over())
                .commit();
    }
}
