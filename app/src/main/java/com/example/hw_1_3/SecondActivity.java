package com.example.hw_1_3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView displayTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        displayTextView = findViewById(R.id.displayTextView);

        Intent intent = getIntent();
        if (intent != null) {
            String email = intent.getStringExtra("EMAIL");
            String subject = intent.getStringExtra("SUBJECT");
            String message = intent.getStringExtra("MESSAGE");

            String displayText = "Email: " + email + "\nSubject: " + subject + "\nMessage: " + message;
            displayTextView.setText(displayText);
        }
    }
}
