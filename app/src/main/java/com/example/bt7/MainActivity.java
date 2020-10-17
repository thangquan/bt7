package com.example.bt7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtEmmail,txtPassWord;
    Button btnSignIn,btnSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtEmmail =(EditText) findViewById(R.id.editTextTextEmailAddress);
        txtPassWord= (EditText) findViewById(R.id.editTextTextPassword);
        btnSignIn=(Button) findViewById(R.id.ButtonSignIn);
        btnSignUp=(Button) findViewById(R.id.ButtonSignUp);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=txtEmmail.getText().toString();
                String pass=txtPassWord.getText().toString();
                if(email.isEmpty() ||email.length()==0)
                    Toast.makeText(MainActivity.this,"Chưa Nhập Email",Toast.LENGTH_LONG).show();
                else if(pass.isEmpty() ||pass.length()==0)
                    Toast.makeText(MainActivity.this,"Chưa Nhập PassWord",Toast.LENGTH_LONG).show();
                else
                    open1();
            }
        });
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open2();
            }
        });

    }
    public void open1(){
        Intent intent =new Intent(this, Profile.class);
        startActivity(intent);
    }
    public void open2(){
        Intent intent =new Intent(this,SignUp.class);
        startActivity(intent);
    }
}