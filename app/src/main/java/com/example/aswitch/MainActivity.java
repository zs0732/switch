package com.example.aswitch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Switch st1;
    Button btn;
    ToggleButton tB;
    ConstraintLayout cl;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        st1 = findViewById(R.id.st1);
        btn = findViewById(R.id.btn);
        tB = findViewById(R.id.tB);
        cl = findViewById(R.id.cl);


    }

    public void lol(View view) {
        if(st1.isChecked() && !(tB.isChecked()))
            cl.setBackgroundColor(Color.rgb(123,123,123));
        if(st1.isChecked() && tB.isChecked())
            cl.setBackgroundColor(Color.GREEN);
        if(!(st1.isChecked()) && tB.isChecked())
            cl.setBackgroundColor(Color.BLUE);
        if(!(st1.isChecked()) && !(tB.isChecked()))
            cl.setBackgroundColor(Color.RED);




    }
}