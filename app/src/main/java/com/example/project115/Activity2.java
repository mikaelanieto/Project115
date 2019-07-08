package com.example.project115;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void showActivity3(View v) {
        Intent i = new Intent(this, Activity3.class);
        startActivity(i);
    }

    public void showActivity4(View v) {
        Intent i = new Intent(this, Activity4.class);
        startActivity(i);
    }

    public void showActivity5(View v) {
        Intent i = new Intent(this, Activity5.class);
        startActivity(i);
    }

    public void showActivity6(View v) {
        Intent i = new Intent(this, Activity6.class);
        startActivity(i);
    }

}
