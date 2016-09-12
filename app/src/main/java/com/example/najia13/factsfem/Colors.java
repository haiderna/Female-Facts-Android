package com.example.najia13.factsfem;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Najia13 on 8/31/2016.
 */
public class Colors {
    private String[] mColor_array = {
            "#660033",
            "#FF0000",
            "#AD0066",
            "#000000",
            "#522c35",
            "#333333",
            "#381904"
    };


    //Methods- gets the facts randomly
    public int getCol() {

        String col;
        Random randomGen = new Random();
        int stat_to_pick = randomGen.nextInt(mColor_array.length);
        col = mColor_array[stat_to_pick];
        int colorToInt = Color.parseColor(col);
        return colorToInt;

    }
    
    
    
    
    
}
