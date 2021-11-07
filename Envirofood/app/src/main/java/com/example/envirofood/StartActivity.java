package com.example.envirofood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.varunest.sparkbutton.SparkButton;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        final SparkButton sparkButton = findViewById(R.id.spark_button);
        sparkButton.setEnabled(false);
        sparkButton.playAnimation();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                    Intent intentMainActivity = new Intent(StartActivity.this, MainActivity.class);
                    startActivity(intentMainActivity);
                    finish();
            }
        }, 2300);
    }
}