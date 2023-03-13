package com.example.quizapp_r61;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnlogin;
    EditText edEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edEmail=findViewById(R.id.etLogin);
        btnlogin = findViewById(R.id.bLogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itLogin = new Intent(MainActivity.this,Quiz1.class);
                itLogin.putExtra("Email",edEmail.getText());
                startActivity(itLogin);
            }
        });

    }

}