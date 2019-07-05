package com.example.project115;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }

    public void showActivity2(View v) {
        Intent i = new Intent(this, Activity2.class);
        startActivity(i);
    }

    public void showActivity31(View v) {
        Intent i = new Intent(this, Activity31.class);
        startActivity(i);
    }

}
