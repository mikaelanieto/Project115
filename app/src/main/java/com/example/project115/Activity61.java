package com.example.project115;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Activity61 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_61);
    }

    public void showActivity6(View v) {
        Intent i = new Intent(this, Activity6.class);
        startActivity(i);
    }

    public void showMessage1(View v){
        Toast toast = Toast.makeText(this, "The World of Sphere, 2003", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage2(View v){
        Toast toast = Toast.makeText(this, "And then and then and then and then and then (Pink), 1999", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage3(View v){
        Toast toast = Toast.makeText(this, "Kaikai Kiki and Me, 2008", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage4(View v){
        Toast toast = Toast.makeText(this, "Panda Family (Gold), 2014", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage5(View v){
        Toast toast = Toast.makeText(this, "Flower Ball, 2002", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage6(View v){
        Toast toast = Toast.makeText(this, "Maiden in the Yellow Straw Hat, 2010", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage7(View v){
        Toast toast = Toast.makeText(this, "SUPERFLAT MY FIRST LOVE FLOWERS, 2010", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage8(View v){
        Toast toast = Toast.makeText(this, "Rainbow Flower - 4 O'Clock, 2007", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage9(View v){
        Toast toast = Toast.makeText(this, "This Merciless World, 2016", Toast.LENGTH_LONG);
        toast.show();
    }
}
