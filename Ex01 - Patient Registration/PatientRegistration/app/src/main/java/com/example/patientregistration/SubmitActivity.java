package com.example.patientregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SubmitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);

        final TextView nameView = findViewById(R.id.nameText);
        final TextView dateView = findViewById(R.id.dateText);
        final TextView genderView = findViewById(R.id.genderText);
        final TextView maritalView = findViewById(R.id.maritalText);
        final TextView timeView = findViewById(R.id.timeText);
        final TextView addictionsView = findViewById(R.id.addictionsText);
        final TextView addressView = findViewById(R.id.addressText);
        final TextView phoneView = findViewById(R.id.phoneText);
        final TextView ageView = findViewById(R.id.ageText);

        //Get the current class' intent and obtain the stored key-value pairs from MainActivity
        Intent submitIntent = getIntent();

        String patientName = submitIntent.getStringExtra("patientName");
        String patientDate = submitIntent.getStringExtra("patientDate");
        String patientGender = submitIntent.getStringExtra("patientGender");
        String patientMarital = submitIntent.getStringExtra("patientMarital");
        String patientTime = submitIntent.getStringExtra("patientTime");
        String patientAddictions = submitIntent.getStringExtra("patientAddictions");
        String patientAddresss = submitIntent.getStringExtra("patientAddress");
        String patientPhone = submitIntent.getStringExtra("patientPhone");
        int patientAge = submitIntent.getIntExtra("patientAge", 0);



        nameView.setText(patientName);
        dateView.setText(patientDate);
        genderView.setText(patientGender);
        maritalView.setText(patientMarital);
        timeView.setText(patientTime);
        addictionsView.setText(patientAddictions);
        addressView.setText(patientAddresss);
        phoneView.setText(patientPhone);
        ageView.setText(Integer.toString(patientAge));

    }
}