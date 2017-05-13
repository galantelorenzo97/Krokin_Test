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

    ArrayAdapter<String> AA;
    ListView LV;

    classes c1 = new classes("ROCK CLIMBING", "TF", "7:00A-8:00A", "Mr. Geodude");
    classes c2 = new classes("ENGLISH", "MW", "8:00A-9:00A", "Mrs. Lily");
    classes c3 = new classes("TROUBLE MAKING", "MR", "5:00P-6:15P", "Mr. Prof");
    classes c4 = new classes("FIREWORKS", "MW", "12.30P-1.45P", "Mr. Sun");
    classes c5 = new classes("", "", "", "");

    String[] CLASSarray = new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics);

        // CREATE CLASS ARRAY
        CLASS_ARRAY();

        // GUI LAYOUT ON THE PAGE
        GUI_UPDATE();

        // ADD BUTTON
        Button mAddClassBtn = (Button) findViewById(R.id.add_class);
        mAddClassBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // POP UP SCREEN PROMPTING FOR CLASS INFORMATION
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Academics.this);
                View mView = getLayoutInflater().inflate(R.layout.add_class_dialog, null);

                // GATHER USER INFO
                final EditText mClassName = (EditText) mView.findViewById(R.id.cName_in);
                final EditText mClassDays = (EditText) mView.findViewById(R.id.cDays_in);
                final EditText mClassTimes = (EditText) mView.findViewById(R.id.cTime_in);
                final EditText mClassProf = (EditText) mView.findViewById(R.id.cProf_in);

                // ACCEPT CHANGE BUTTON
                Button mAddCtrlBtn = (Button) mView.findViewById(R.id.class_add_dialog_btn);

                // DISPLAY DIALOG
                mBuilder.setView(mView);
                final AlertDialog dialog = mBuilder.create();
                dialog.show();

                mAddCtrlBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // SET C5 TO THE NEW ADDED CLASS
                        c5.setName(mClassName.getText().toString());
                        c5.setDays(mClassDays.getText().toString());
                        c5.setTime(mClassTimes.getText().toString());
                        c5.setProfessor(mClassProf.getText().toString());

                        // CREATE NEW ARRAY FOR CLASS DISPLAY
                        CLASS_ARRAY();
                        GUI_UPDATE();
                        AA.notifyDataSetChanged();
                        dialog.dismiss();
                    }
                });
            }
        });
    }

    public void GUI_UPDATE(){
        LV = (ListView) findViewById(R.id.classListView);
        AA = new ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.listTextView, CLASSarray);
        LV.setAdapter(AA);
    }

    public void CLASS_ARRAY(){
        CLASSarray[0] = c1.getName() + "\n" + c1.getDays() + "  " + c1.getTime() + "  " + c1.getProfessor();
        CLASSarray[1] = c2.getName() + "\n" + c2.getDays() + "  " + c2.getTime() + "  " + c2.getProfessor();
        CLASSarray[2] = c3.getName() + "\n" + c3.getDays() + "  " + c3.getTime() + "  " + c3.getProfessor();
        CLASSarray[3] = c4.getName() + "\n" + c4.getDays() + "  " + c4.getTime() + "  " + c4.getProfessor();
        CLASSarray[4] = c5.getName() + "\n" + c5.getDays() + "  " + c5.getTime() + "  " + c5.getProfessor();
    }
}
