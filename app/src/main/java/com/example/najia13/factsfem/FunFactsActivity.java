package com.example.najia13.factsfem;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    //Declare view variables
    private FactSheet mFactSheet = new FactSheet();
    private Colors mColors = new Colors();
    private TextView mFactTextView;
    private Button mFactButton;
    private RelativeLayout mRelativeLayout;
    private Button mSecondButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Assign Views from layout file to corresponding variables
        mFactTextView = (TextView)findViewById(R.id.facttextview);
        mFactButton = (Button)findViewById(R.id.showthebutton);
        mSecondButton = (Button)findViewById(R.id.button);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            // button was clicked/tapped, fact will be updated
                //Randomly select a fact
                String stat = mFactSheet.getStat();
                int color = mColors.getCol();

                //Update Screen
                mFactTextView.setText(stat);
                mRelativeLayout.setBackgroundColor(color);
                mFactButton.setTextColor(color);
            }
        };

        //add another on click listener here
        //the button will redirect to one specific fact and color (aka the source page)
        View.OnClickListener second_listener = new View.OnClickListener(){

            @Override
            public void onClick(View e){
                //For source page
                String source =
                        "PsycExtra, UNICEF, RAINN, Sex- Crimes Laws, Telegraph  ";
                mFactTextView.setText(source);

            }

        };
        mFactButton.setOnClickListener(listener);
        mSecondButton.setOnClickListener(second_listener);


    }
}
