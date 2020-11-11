package com.example.jin_ro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //メイン画面
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //画面転移
        findViewById(R.id.new_game).setOnClickListener(this::onClick);
    }

    //画面転移onClick
    public void onClick(View view){
        Intent intent = new Intent(this,number_of_people.class);
        startActivity(intent);
    }
}