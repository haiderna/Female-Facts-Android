package com.example.najia13.factsfem;

import java.util.Random;

public class FactSheet {
//Properties
        private String[] mStats_array = {
        "99% of Egyptian women have experienced harassment",
        "Every 2 minutes a woman is forced into marriage",
        "Women make up 70% of the national prositution population and average age of entry is 14 years old",
        "Suicide is the leading cause of death in girls worldwide ",
        "FGM over 80% in Egypt, Sudan, Somalia, and Mali",
        "39% of teen moms were impregnated by men between 20 and 29.7 years old",
        "Females ages 16-19 are 4 times more likely than the general population to be victims of rape, attempted rape, or sexual assault"
};


//Methods- gets the facts randomly
        public String getStat() {
        //Add a loop in here so the array is read in an order and a source page can be placed at the end
            /** int i= 0
             *  for (i
             *
             */

            String stat = "";
            Random randomGen = new Random();
            int stat_to_pick = randomGen.nextInt(mStats_array.length);
            stat = mStats_array[stat_to_pick];
            return stat;

        }



}
