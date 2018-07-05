package com.example.nirav.login;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void signupClicked(View view) {
        Intent i = new Intent(getApplicationContext(), signupActivity.class);
        startActivity(i);
    }

    public void fpassword(View view){
        Intent i = new Intent(getApplicationContext(), forgotpasswordActivity.class);
        startActivity(i);
    }

    public void loginClicked(View view){
        Intent i = new Intent(getApplicationContext(), activityActivity.class);
        startActivity(i);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
