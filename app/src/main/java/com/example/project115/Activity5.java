package com.example.project115;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
    }

    public void showActivity2(View v) {
        Intent i = new Intent(this, Activity2.class);
        startActivity(i);
    }

    public void showActivity51(View v) {
        Intent i = new Intent(this, Activity51.class);
        startActivity(i);
    }
}
