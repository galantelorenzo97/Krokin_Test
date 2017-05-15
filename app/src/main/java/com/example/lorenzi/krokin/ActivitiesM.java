package com.example.lorenzi.krokin;

/**
 * Created by INKT on 5/13/2017.
 */

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class ActivitiesM extends AppCompatActivity {

    /*
    ArrayAdapter<String> AA;
    ListView LV;

    activities A1 = new activities("CLUB MEETING", "TWR", "2:00P-3:00P");
    activities A2 = new activities("BASKETBALL", "MTWRF", "5:00P-7:00P");
    activities A3 = new activities("STUDY SESSION", "F", "10:00P-11:00P");
    activities A4 = new activities("", "", "");

    String[] ACTarr = new String[4];
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);
    }
}
    /*
        // CREATE CLASS ARRAY
        ACT_arr();

        // GUI LAYOUT ON THE PAGE
        GUI_UPDATE();

        // ADD BUTTON
        Button addActivity = (Button) findViewById(R.id.ACTIVITYbutton);
        addActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // POP UP SCREEN PROMPTING FOR CLASS INFORMATION
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(ActivitiesM.this);
                View mView = getLayoutInflater().inflate(R.layout.activity_add_dialog, null);

                // GATHER USER INFO
                final EditText actName = (EditText) mView.findViewById(R.id.actName);
                final EditText actDay = (EditText) mView.findViewById(R.id.actDays);
                final EditText actTime = (EditText) mView.findViewById(R.id.actTime);

                // ACCEPT CHANGE BUTTON
                Button mAddAct = (Button) mView.findViewById(R.id.actOKBUTTON);

                // DISPLAY DIALOG
                mBuilder.setView(mView);
                final AlertDialog dialog = mBuilder.create();
                dialog.show();

                mAddAct.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // SET C5 TO THE NEW ADDED CLASS
                        A4.setName(actName.getText().toString());
                        A4.setDays(actDay.getText().toString());
                        A4.setTime(actTime.getText().toString());


                        // CREATE NEW ARRAY FOR CLASS DISPLAY
                        ACT_arr();
                        GUI_UPDATE();
                        AA.notifyDataSetChanged();
                        dialog.dismiss();
                    }
                });
            }
        });
    }

    public void GUI_UPDATE(){
        LV = (ListView) findViewById(R.id.ACTIVITY_LV);
        AA = new ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.actLV, ACTarr);
        LV.setAdapter(AA);
    }

    public void ACT_arr(){
        ACTarr[0] = A1.getName() + "\n" + A1.getDays() + "  " + A1.getTime();
        ACTarr[1] = A2.getName() + "\n" + A2.getDays() + "  " + A2.getTime();
        ACTarr[2] = A3.getName() + "\n" + A3.getDays() + "  " + A3.getTime();
        ACTarr[3] = A4.getName() + "\n" + A4.getDays() + "  " + A4.getTime();
    }
}*/
