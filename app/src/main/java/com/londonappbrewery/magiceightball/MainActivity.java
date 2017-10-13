package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static com.londonappbrewery.magiceightball.R.id.button_ask;
import static com.londonappbrewery.magiceightball.R.id.image_eightBall;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);

        Button shakeButton = (Button) findViewById(R.id.button_ask);

        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        shakeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("magiceightball", "The button was pressed.");

                Random randomNumber = new Random();

                int number = randomNumber.nextInt(5);

                Log.d("magiceightball", "The Number was: " + number);

                ballDisplay.setImageResource(ballArray[number]);
            }
        });
    }
}
