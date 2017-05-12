package com.example.lorenzi.krokin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Academics extends AppCompatActivity {

    //private ArrayList<TextView> tx = new ArrayList<TextView>();

    public static ArrayList<String> list = new ArrayList<String>();
    static String C1 = "ENGLIGH";
    static String C2 = "MATH";
    static String C3 = "ROCK CLIMBING";
    static String C4 = "EXPLOSIVES & WELDING";

/*
    public static ArrayList<classes> clist = new ArrayList<classes>();

    // CREATE FAKE CLASSES
    static classes C1 = new classes("ENGLISH", "TR", "1:45 - 3:15", "MR. ENGLISHDUDE");
    static classes C2 = new classes("MATH", "MW", "11:30 - 12:45", "MR. MATHDUDE");
    static classes C3 = new classes("ROCK CLIMBING", "MW", "2:00 - 3:5", "MR. GEODUDE");

        // ADD TO ARRAY LIST
  */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics);

        ListView LV = (ListView)findViewById(R.id.classView);

        ArrayAdapter<String> AA = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                list);
        LV.setAdapter(AA);

        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String sc = list.get(position);
                Toast.makeText(getApplicationContext(), "CLASS " + sc, Toast.LENGTH_LONG).show();
            }
        });
    }
}
    /*    clist.add(C1);
        clist.add(C2);
        clist.add(C3);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics);

    ListView classView1 = (ListView) findViewById(R.id.classView);

//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.layout.classView, )
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, ,R.layout.classView1 );
    */