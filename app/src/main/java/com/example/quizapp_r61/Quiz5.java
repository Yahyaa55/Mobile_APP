package com.example.quizapp_r61;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quiz5 extends AppCompatActivity {
    Button Next5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);
        Next5 = findViewById(R.id.bNext);
        Next5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Next = new Intent(Quiz5.this,Score.class);
                startActivity(Next);
            }
        });
    }
}