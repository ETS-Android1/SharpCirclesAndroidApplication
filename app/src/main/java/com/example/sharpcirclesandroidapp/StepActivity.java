package com.example.sharpcirclesandroidapp;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StepActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    SeoStepsAdapter seoStepsAdapter;
    ArrayList<SeoSteps> seoSteps;
    Toolbar toolbar;

    public static final String StepNum[]={"Step 1","Step 2","Step 3",
            "Step 4", "Step 5","Step 6","Step 7", "Step 8","Step 9","Step 10"};

    public static final String  Steps []={" Site Verification",
            "Sitemap Creation & Submission",
            "Robots.txt File Creation",
            "Site Submission & Indexing",
            "Keyword Identification",
            "On-Page Optimisation-Back-End Code",
            "On-Page Optimization-Content",
            "On-Page Optimization- Eliminate Broken Links",
            "Off-Page Optimization-Backlink Profile",
            "Results and Strategy Review"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("SEO Steps");
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);





        seoSteps = new ArrayList<>();
        for(int i=0;i<Steps.length;i++)
        {
            SeoSteps tvSteps = new SeoSteps();

            tvSteps.setStep(Steps[i]);
            tvSteps.setStepnum(StepNum[i]);

            seoSteps.add(tvSteps);
        }


        seoStepsAdapter = new SeoStepsAdapter(seoSteps);

        recyclerView = (RecyclerView)findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(seoStepsAdapter);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
