package com.fakemoneydetector.asr.fakemoneydetector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by jhjkmkl on 22-Aug-15.
 */
public class Details extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_layout);

        Button first = (Button)findViewById(R.id.hundredTtakaButton);
        Button second = (Button)findViewById(R.id.fiveHundredTakaButton);
        Button third = (Button)findViewById(R.id.thousandTakaButton);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Details.this,Details100.class);
                startActivity(i);
            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Details.this, Details500.class);
                startActivity(i);
            }
        });

        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Details.this, Details1000.class);
                startActivity(i);
            }
        });
    }
}
