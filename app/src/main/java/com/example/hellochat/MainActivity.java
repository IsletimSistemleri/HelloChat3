package com.example.hellochat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        private Button btnLogin,btnRegister;

        public  void  init(){
            btnLogin = (Button) findViewById(R.id.btnWelcomeLogin);
            btnRegister = (Button) findViewById(R.id.btnWelcomeRegister);

        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       init();

       btnLogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intentLogin = new Intent(MainActivity.this, LoginActivity.class);
               startActivity(intentLogin);
           }
       });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRegister = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intentRegister);
            }
        });

    }
}