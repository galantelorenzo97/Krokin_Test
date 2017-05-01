package com.example.lorenzi.krokin;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class StudentClasses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_classes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        studentClassList.add(new Class("Software Engineering", "5.00-6.15P MW","N/A","HUM218", "Di Wang"));

        mAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        }
    }

    Button mAdd = (Button) findViewById(R.id.add);
    Button mDrop = (Button) findViewById(R.id.drop);
    Button mEdit = (Button) findViewById(R.id.edit);

    ArrayList<Class> studentClassList = new ArrayList<Class>();

    private void addClass()
    {

    }

    private void dropClass(String toDelete)
    {
        for(int scan=0; scan<studentClassList.size(); scan++)
        {
            if (studentClassList.get(scan).getClassName().equals(toDelete))
            {
                studentClassList.remove(scan);
            }
        }
    }

    private void editClass()
    {

    }

}
