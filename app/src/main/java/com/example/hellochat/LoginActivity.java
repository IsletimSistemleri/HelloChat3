package com.example.hellochat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {
    private Toolbar actionbarLogin;
    public  void init(){
        actionbarLogin=findViewById(R.id.action_bar_Login);
        setSupportActionBar(actionbarLogin);
        getSupportActionBar().setTitle("HESABIM VAR");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }
}