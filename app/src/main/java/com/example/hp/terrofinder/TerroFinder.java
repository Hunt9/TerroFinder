package com.example.hp.terrofinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class TerroFinder extends AppCompatActivity {

    private EditText myUsername;
    private EditText myPassword;
    private CheckBox myRememberMe;
    private TextView myForgotPass;
    private Button myLogin;
    private Button mySignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terro_finder);

        myUsername = (EditText)findViewById(R.id.username);
        myPassword = (EditText)findViewById(R.id.password);
        myRememberMe = (CheckBox)findViewById(R.id.rememberme);
        myForgotPass = (TextView)findViewById(R.id.forgotpass);
        myLogin = (Button)findViewById(R.id.login);
        mySignup = (Button)findViewById(R.id.signup);


        mySignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(TerroFinder.this,Signup.class);
                startActivity(mainIntent);
            }
        });


    }
}
