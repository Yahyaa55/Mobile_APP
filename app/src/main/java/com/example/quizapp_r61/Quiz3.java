package com.example.quizapp_r61;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quiz3 extends AppCompatActivity {
    Button Next3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        Next3 = findViewById(R.id.bNext);
        Next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Next = new Intent(Quiz3.this,Quiz4.class);
                startActivity(Next);
            }
        });
    }
}