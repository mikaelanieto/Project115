package com.example.project115;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity51 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_51);
    }

    public void showActivity5(View v) {
        Intent i = new Intent(this, Activity5.class);
        startActivity(i);
    }
}
