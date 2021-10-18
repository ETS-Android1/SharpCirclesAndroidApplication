package com.example.sharpcirclesandroidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Sharp Circles");
        setSupportActionBar(toolbar);
        Button aboutbutton = (Button)findViewById(R.id.buttonabout);
        Button stepbutton = (Button)findViewById(R.id.buttonstep);
        Button buttonhelp =(Button)findViewById(R.id.buttonhelp);

        aboutbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buttonclicked = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(buttonclicked);
            }
        });

        stepbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stepbuttonclick = new Intent(MainActivity.this,StepActivity.class);
                startActivity(stepbuttonclick);
            }
        });

        buttonhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent helpbuttonclick = new Intent(MainActivity.this,HelpActivity.class);
                startActivity(helpbuttonclick);
            }
        });

    }
}