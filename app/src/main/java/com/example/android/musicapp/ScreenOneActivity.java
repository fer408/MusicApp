package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScreenOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_one);


        Button mainBtn1 =(Button)findViewById(R.id.main1);



        mainBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_second_activity = new Intent(ScreenOneActivity.this,MainActivity.class);
                startActivity(m_second_activity);
            }
        });
    }
}
