package com.example.sharpcirclesandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.example.sharpcirclesandroidapp.HelperClasses.ImageSliderAdapter;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class Dashboard extends AppCompatActivity {

    SliderView sliderView;
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

        ImageSliderAdapter sliderAdapter = new ImageSliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
    }
}