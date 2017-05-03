package com.example.lorenzi.krokin;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start2);

        Button mLoginCtrl = (Button) findViewById(R.id.login_btn);
        mLoginCtrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //10:44

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(StartActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.login_dialog, null);
                final EditText mUser = (EditText) mView.findViewById(R.id.userInput);
                final EditText mPassword = (EditText) mView.findViewById(R.id.passwordInput);
                Button mLoginCtrl = (Button) mView.findViewById(R.id.login_dialog_btn);

                mLoginCtrl.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        user student = new user("test", "password", 001);
                        if(mUser.getText().toString().equals(student.getAcc()) &&
                                mPassword.getText().toString().equals(student.getPass()))
                        {
                            Toast.makeText(StartActivity.this,
                                            "Login Successful",
                                            Toast.LENGTH_SHORT).show();
                        }
                        else
                        {

                        }
                    }
                });
            }
        });
    }


}
