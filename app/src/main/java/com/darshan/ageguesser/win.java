package com.darshan.ageguesser;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class win extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        setContentView(R.layout.activity_win);
        Button mButton = (Button) findViewById(R.id.buttonf);
        ImageView animal = (ImageView) findViewById(R.id.animal1);
        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("intVariableName", 0);
        int score = mIntent.getIntExtra("intScore", 0);
        int x = (int) (Math.random() * 11 + 1);

        if (x == 1) {
            animal.setImageResource(R.drawable.ani1);
        } else if (x == 2) {
            animal.setImageResource(R.drawable.ani2);

        } else if (x == 3) {
            animal.setImageResource(R.drawable.ani3);

        } else if (x == 4) {
            animal.setImageResource(R.drawable.ani4);

        } else if (x == 5) {

            animal.setImageResource(R.drawable.ani5);
        } else if (x == 6) {

            animal.setImageResource(R.drawable.ani6);
        } else if (x == 7) {

            animal.setImageResource(R.drawable.ani7);
        } else if (x == 8) {

            animal.setImageResource(R.drawable.ani8);
        } else if (x == 9) {
            animal.setImageResource(R.drawable.ani9);

        } else if (x == 10) {
            animal.setImageResource(R.drawable.ani10);

        } else if (x == 11) {
            animal.setImageResource(R.drawable.ani11);

        }
        TextView mText = (TextView) findViewById(R.id.textView3);
        if (intValue != -1)
            mText.setText("You're " + intValue + " years old! I guessed it in " + +score + " tries.");
        else {
            mText.setText("Error could not find age.");

        }
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        mButton.setBackgroundColor(color);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goStarting = new Intent(win.this, MainActivity.class);
                startActivity(goStarting);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent goStarting = new Intent(win.this, MainActivity.class);
        startActivity(goStarting);
    }


}
