package com.example.envirofood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ExchangeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange);
    }

    public void comingSoon(View view) {
        Toast.makeText(this, "Please support Studyfudy to unlock all our functionalities! :)", Toast.LENGTH_LONG).show();
    }

    public void nina_message(View view) {
        // Intent toChat = new Intent(ExchangeActivity.this, ChatActivity.class);
        // startActivity(toChat);
        comingSoon(view);
    }
}