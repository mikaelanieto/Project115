package com.example.project115;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Activity41 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_41);
    }

    public void showActivity4(View v) {
        Intent i = new Intent(this, Activity4.class);
        startActivity(i);
    }

    public void showMessage1(View v){
        Toast toast = Toast.makeText(this, "Sugar Ray Robinson, 1982", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage2(View v){
        Toast toast = Toast.makeText(this, "In Italian, 1983", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage3(View v){
        Toast toast = Toast.makeText(this, "Trumpet, 1984", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage4(View v){
        Toast toast = Toast.makeText(this, "Pez Dispenser, 1984", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage5(View v){
        Toast toast = Toast.makeText(this, "Rome Pays Off, 1982", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage6(View v){
        Toast toast = Toast.makeText(this, "Untitled, 1981", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage7(View v){
        Toast toast = Toast.makeText(this, "Olympic, 1983", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage8(View v){
        Toast toast = Toast.makeText(this, "Liberty, 1983", Toast.LENGTH_LONG);
        toast.show();
    }
    public void showMessage9(View v){
        Toast toast = Toast.makeText(this, "Crown, 1983", Toast.LENGTH_LONG);
        toast.show();
    }

}
