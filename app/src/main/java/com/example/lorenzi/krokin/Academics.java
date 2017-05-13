package com.example.lorenzi.krokin;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Academics extends AppCompatActivity {

    ListView simpleList;

    classes c1 = new classes("Phone dialing", "TF", "7.00-8.00", "Mr. Professor");
    classes c2 = new classes("Computer Hell", "SUN", "8.00A-8.00P", "Paul Zuckerman");
    classes c3 = new classes("Bart Simpsoning", "MR", "5.00-6.15PM", "Leaky Bum");
    classes c4 = new classes("Explosives", "MW", "12.30-1.45", "Hugh G. Rection");
    classes c5 = new classes("", "", "", "");

    String someList[] = {c1.getName() + "\n" + c1.getDays() + ", " + c1.getTime() + ", " + c1.getProfessor()
            , c2.getName() + "\n" + c2.getDays() + ", " + c2.getTime() + ", " + c2.getProfessor()
            , c3.getName() + "\n" + c3.getDays() + ", " + c3.getTime() + ", " + c3.getProfessor()
            , c4.getName() + "\n" + c4.getDays() + ", " + c4.getTime() + ", " + c4.getProfessor()
            , c5.getName() + "\n" + c5.getDays() + ", " + c5.getTime() + ", " + c5.getProfessor()};

    String listOC[] = {"ENGLISH", "ROCK CLIMBING", "EXPLOSIVES", "WATCH BUILDINGS"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics);

        simpleList = (ListView) findViewById(R.id.classListView);//

        final ArrayAdapter<String> AA = new ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.listTextView, someList);
        simpleList.setAdapter(AA);

        Button mAddClassBtn = (Button) findViewById(R.id.add_class);

        mAddClassBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Academics.this);
                View mView = getLayoutInflater().inflate(R.layout.add_class_dialog, null);

                final EditText mClassName = (EditText) mView.findViewById(R.id.cName_in);
                final EditText mClassDays = (EditText) mView.findViewById(R.id.cDays_in);
                final EditText mClassTimes = (EditText) mView.findViewById(R.id.cTime_in);
                final EditText mClassProf = (EditText) mView.findViewById(R.id.cProf_in);

                Button mAddCtrlBtn = (Button) mView.findViewById(R.id.class_add_dialog_btn);

                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();

                mAddCtrlBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        classes class_input = new classes(mClassName.getText().toString(), mClassDays.getText().toString(), mClassTimes.getText().toString(), mClassProf.getText().toString());
                        c5 = class_input;
                        AA.notifyDataSetChanged();
                        //simpleList.setAdapter(AA);

                        if (1 == 1)
                        {
                            Toast.makeText(Academics.this,
                                    "TESTING",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }


        }
    );}

    });}}
