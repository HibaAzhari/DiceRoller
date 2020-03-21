package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Dice dice = new Dice();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer diceSound = MediaPlayer.create(this, R.raw.dice_sound);

        setUpRolling(diceSound);
        updateUI();
    }

    private void setUpRolling(final MediaPlayer rollSound) {
        ImageButton button = (ImageButton) findViewById(R.id.diceIllustration);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                rollSound.start();
                dice.roll();
                updateUI();
            }
        });
    }

    private void updateUI() {
        ImageView imageView = (ImageView) findViewById(R.id.diceIllustration);
        int res = dice.getImage();
        imageView.setImageResource(res);
    }
}
