package com.example.lorenzi.krokin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        // CREATE BUTTONS
        Button mAcademics = (Button) findViewById(R.id.acad);
        Button mActivities = (Button) findViewById(R.id.act);
        Button mCalendar = (Button) findViewById(R.id.calendar);
        Button mSettings = (Button) findViewById(R.id.settings);

        mAcademics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(HomePage.this, Academics.class));
            }

        });

        mActivities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(HomePage.this, ActivitiesM.class));
            }

        });

        mCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(HomePage.this, Calendar.class));
            }

        });

        mSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(HomePage.this, Academics.class));
            }

        });
    }



}
