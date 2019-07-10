package com.example.project115;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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

    public void showMessage1(View v){
        Toast toast = Toast.makeText(this, "White Center (Yellow, Pink and Lavender on Rose), 1950", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage2(View v){
        Toast toast = Toast.makeText(this, "Untitled (Blue Divided by Blue), 1966", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage3(View v){
        Toast toast = Toast.makeText(this, "No. 6 (Violet, Green and Red), 1951", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage4(View v){
        Toast toast = Toast.makeText(this, "Violet, Black, Orange, Yellow on White and Red, 1949", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage5(View v){
        Toast toast = Toast.makeText(this, "Untitled (Yellow-Red and Blue), 1953", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage6(View v){
        Toast toast = Toast.makeText(this, "Ochre and Red on Red, 1954", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage7(View v){
        Toast toast = Toast.makeText(this, "Green and Tangerine on Red, 1956", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage8(View v){
        Toast toast = Toast.makeText(this, "No.301, 1959", Toast.LENGTH_LONG);
        toast.show();
    }

}
