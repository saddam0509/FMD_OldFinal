package com.fakemoneydetector.asr.fakemoneydetector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by jhjkmkl on 22-Aug-15.
 */
public class Transparency extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transparency_layout);

        Button first = (Button)findViewById(R.id.hundredTtakaButton);
        Button second = (Button)findViewById(R.id.fiveHundredTakaButton);
        Button third = (Button)findViewById(R.id.thousandTakaButton);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Transparency.this,Trans100.class);
                startActivity(i);
            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Transparency.this,Trans500.class);
                startActivity(i);
            }
        });

        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Transparency.this,Trans1000.class);
                startActivity(i);
            }
        });
    }
}
