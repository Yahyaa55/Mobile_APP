package com.example.quizapp_r61;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Quiz1 extends AppCompatActivity {
TextView edQuestion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
        edQuestion=findViewById(R.id.title);
        Intent intent = getIntent();
        edQuestion.setText(intent.getStringExtra("Email"));
    }
}