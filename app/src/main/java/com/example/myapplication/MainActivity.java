package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView digit;
    ImageView chelick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        digit = findViewById(R.id.digit);
        chelick = findViewById(R.id.chelick);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    private int moduleDigit(int baseDigit, int smallDigit) {
        return baseDigit % smallDigit;
    }

    public void moduleCounter(View view) {
        int bD = 100;
        int sD = 3;
        int res = moduleDigit(bD, sD);
        digit.setText(""+res);
        chelick.setVisibility(View.VISIBLE);
    }
}