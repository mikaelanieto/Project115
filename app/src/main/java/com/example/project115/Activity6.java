package com.example.project115;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
    }

    public void showActivity2(View v) {
        Intent i = new Intent(this, Activity2.class);
        startActivity(i);
    }

    public void showActivity61(View v) {
        Intent i = new Intent(this, Activity61.class);
        startActivity(i);
    }
}
