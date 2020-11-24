package com.example.jin_ro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class game extends AppCompatActivity {

    //ゲーム画面
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        CountDownTimer cdt = new CountDownTimer(10000.100) {
            @Override
            public void onTick(long millisUntilFinished) {
                int time = (int)millisUntilFinished /1000;

                TextView textView = (TextView) findViewById(R.id.tm);
                textView.setText(time);
            }

            @Override
            public void onFinish() {
                finish();
            }
        }
    }
}