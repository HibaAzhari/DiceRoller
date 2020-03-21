package com.example.dice;

import android.content.Context;
import android.media.Image;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Control the face of the dice
 * @author Hiba Azhari
 */
public class Dice {
    public static final String[] faces = {"I", "II", "III", "IV", "V", "VI"};
    private String currentFace = faces[0];
    private static final Random random = new Random();
    public Context context;

    public String getCurrentFace() {
        return currentFace;
    }

    public void setCurrentFace(String currentFace) {
        this.currentFace = currentFace;
    }

    public void roll(){
        currentFace = faces[random.nextInt(faces.length)];
    }

    public int getImage() {
        switch (this.currentFace) {
            case "I":
                return R.drawable.i;
            case "II":
                return R.drawable.ii;
            case "III":
                return R.drawable.iii;
            case "IV":
                return R.drawable.iv;
            case "V":
                return R.drawable.v;
            case "VI":
                return R.drawable.vi;
            default:
                return R.drawable.i;
        }
    }

    @Override
    public String toString() {
        return currentFace;
    }
}
