package com.example.hellochat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        private Button btnWelcomeLogin,btnWelcomeRegister;

        public  void  init(){
            btnWelcomeLogin = (Button) findViewById(R.id.btnWelcomeLogin);
            btnWelcomeRegister = (Button) findViewById(R.id.btnWelcomeRegister);

        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       init();

    }
}