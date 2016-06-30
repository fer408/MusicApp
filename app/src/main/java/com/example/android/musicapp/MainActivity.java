package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Buttons that connect to my buttons are created here
        Button btn1 = (Button)findViewById(R.id.button1);
        Button btn2 = (Button)findViewById(R.id.button2);
        Button btn3 = (Button)findViewById(R.id.button3);
        Button btn4 = (Button)findViewById(R.id.button4);

//Button to submits

//code that connects MainActivity to ScreenOneActivity(activity_second)

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_second_activity = new Intent(MainActivity.this,ScreenOneActivity.class);
                startActivity(i_second_activity);
            }
        });

//code that connects MainActivity to ScreenTwoActivity(activity_third)

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_third_activity = new Intent(MainActivity.this,ScreenTwoActivity.class);
                startActivity(i_third_activity);
            }
        });

//code that connects MainActivity to ScreenThreeActivity(activity_fourth)

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_fourth_activity = new Intent(MainActivity.this,ScreenThreeActivity.class);
                startActivity(i_fourth_activity);
            }
        });

//code that connects MainActivity to ScreenFourActivity(activity_fifth)

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_fifth_activity = new Intent(MainActivity.this,ScreenFourActivity.class);
                startActivity(i_fifth_activity);
            }
        });




}
}
