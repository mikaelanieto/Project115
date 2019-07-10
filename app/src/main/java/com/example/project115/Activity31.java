package com.example.project115;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Activity31 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_31);
    }

    public void showActivity3(View v) {
        Intent i = new Intent(this, Activity3.class);
        startActivity(i);
    }

    public void showMessage1(View v){
        Toast toast = Toast.makeText(this, "Marilyn Monroe, 1967", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage2(View v){
        Toast toast = Toast.makeText(this, "Flowers, 1970", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage3(View v){
        Toast toast = Toast.makeText(this, "Chanel No. 5, 1980", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage4(View v){
        Toast toast = Toast.makeText(this, "Campbell’s Soup Cans (detail), 1962", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage5(View v){
        Toast toast = Toast.makeText(this, "Banana, 1967", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage6(View v){
        Toast toast = Toast.makeText(this, "Cow, 1966", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage7(View v){
        Toast toast = Toast.makeText(this, "The Last Supper, 1986", Toast.LENGTH_LONG);
        toast.show();
    }

    public void showMessage8(View v){
        Toast toast = Toast.makeText(this, "Portrait of Maurice, 1976", Toast.LENGTH_LONG);
        toast.show();
    }
    public void showMessage9(View v){
        Toast toast = Toast.makeText(this, "Self-Portrait, 1966", Toast.LENGTH_LONG);
        toast.show();
    }
}
