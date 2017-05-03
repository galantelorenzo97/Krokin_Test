package com.example.lorenzi.krokin;

import android.content.Intent;
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
        Button mRegisterCtrl = (Button) findViewById(R.id.register_btn);


        mLoginCtrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(StartActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.login_dialog, null);
                final EditText mUser = (EditText) mView.findViewById(R.id.userInput);
                final EditText mPassword = (EditText) mView.findViewById(R.id.passwordInput);
                Button mLoginCtrlDialog = (Button) mView.findViewById(R.id.login_dialog_btn);

                mLoginCtrlDialog.setOnClickListener(new View.OnClickListener() {
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

                            startActivity(new Intent(StartActivity.this, HomePage.class));

                        }
                        else
                        {
                            Toast.makeText(StartActivity.this,
                                    "Invalid Login",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });

                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });

        mRegisterCtrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(StartActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.register_dialog, null);
                final EditText mUser = (EditText) mView.findViewById(R.id.userInput);
                final EditText mPassword = (EditText) mView.findViewById(R.id.passwordInput);
                Button mRegisterCtrlDialog = (Button) mView.findViewById(R.id.register_dialog_btn);

            mRegisterCtrlDialog.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    user student1 = new user(mUser.getText().toString(),mPassword.getText().toString(),002);

                    Toast.makeText(StartActivity.this,
                            "Registration Successful. Welcome " + mUser.getText().toString(),
                            Toast.LENGTH_SHORT).show();

                    startActivity(new Intent(StartActivity.this, HomePage.class));
                }
            });

                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();

            }
        });
    }


}