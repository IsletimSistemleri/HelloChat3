package com.example.hellochat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class RegisterActivity extends AppCompatActivity {

    private Toolbar actionbarRegister;
    public  void init(){
        actionbarRegister=findViewById(R.id.action_bar_Register);
        setSupportActionBar(actionbarRegister);
        getSupportActionBar().setTitle("YENİ HESAP OLUŞTUR");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();
    }
}