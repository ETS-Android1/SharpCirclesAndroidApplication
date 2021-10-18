package com.example.sharpcirclesandroidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.sharpcirclesandroidapp.HelperClasses.ImageSliderAdapter;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class Dashboard extends AppCompatActivity {

    SliderView sliderView;
    CardView cvabout, cvhelp, cvstep;
    int[] images = { R.drawable.search_place,
            R.drawable.make_a_call,
            R.drawable.add_missing_place,
            R.drawable.sit_back_and_relax};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); // remove status bar
        setContentView(R.layout.activity_dashboard);

        sliderView = findViewById(R.id.image_slider);
        cvabout = findViewById(R.id.cardabout);
        cvhelp= findViewById(R.id.cardhelp);
        cvstep = findViewById(R.id.cardstep);

        ImageSliderAdapter sliderAdapter = new ImageSliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

        cvabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buttonclicked = new Intent(Dashboard.this,AboutActivity.class);
                startActivity(buttonclicked);
            }
        });

        cvhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent helpbuttonclick = new Intent(Dashboard.this,HelpActivity.class);
                startActivity(helpbuttonclick);
            }
        });
        cvstep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stepbuttonclick = new Intent(Dashboard.this,StepActivity.class);
                startActivity(stepbuttonclick);
            }
        });
    }
}