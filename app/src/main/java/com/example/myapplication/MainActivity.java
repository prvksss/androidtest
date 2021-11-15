package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

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

    /**
     *
     * @param baseDigit
     * @param smallDigit
     * @return module of both
     */
    private int moduleDigit(int baseDigit, int smallDigit) {
        return baseDigit % smallDigit;
    }

    /**
     *
     * @param view
     */
    public void moduleCounter(View view) {
        int bD = new Random().nextInt(61) + 20;
        ;
        int sD = 3;
        int res = moduleDigit(bD, sD);
        digit.setText("" + res);

        if (res == 1) {
            Intent i = new Intent(MainActivity.this, NavActivity.class);
            startActivity(i);
        }
//        switch (res) {
//            case 0:
//                chelick.setVisibility(View.VISIBLE);
//                break;
//            case 1:
//                chelick.setVisibility(View.INVISIBLE);
//                break;
//            case 2:
//                digit.setTextColor(Color.GREEN);
//                break;
//            default:
//                break;
//        }
//
//        if (res == 0) {
//            chelick.setVisibility(View.VISIBLE);
//        } else if(res == 1) {
//            chelick.setVisibility(View.INVISIBLE);
//        }else if(res == 2) {
//            digit.setTextColor(Color.GREEN);
//        }else{
//            Log.e("LOL", " KEK");
//        }
    }
}