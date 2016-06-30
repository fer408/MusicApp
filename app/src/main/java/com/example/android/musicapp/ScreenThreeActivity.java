package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScreenThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_three);

        Button mainBtn3 =(Button)findViewById(R.id.main3);


        mainBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_fourth_activity = new Intent(ScreenThreeActivity.this,MainActivity.class);
                startActivity(m_fourth_activity);
            }
        });

    }
}
