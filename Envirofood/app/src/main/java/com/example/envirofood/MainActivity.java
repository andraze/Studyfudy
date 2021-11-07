package com.example.envirofood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void comingSoon(View view) {
        Toast.makeText(this, "Please support Studyfudy to unlock all our functionalities! :)", Toast.LENGTH_LONG).show();
    }

    public void toExchange(View view) {
        Intent toExchangeIntent = new Intent(MainActivity.this, ExchangeActivity.class);
        startActivity(toExchangeIntent);
    }
}