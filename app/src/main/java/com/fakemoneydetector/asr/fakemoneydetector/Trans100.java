package com.fakemoneydetector.asr.fakemoneydetector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by jhjkmkl on 26-Aug-15.
 */
public class Trans100 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transparency_layout_100);

        ImageButton first = (ImageButton)findViewById(R.id.hundredTakaTypeOne);
        ImageButton second = (ImageButton)findViewById(R.id.hundredTakaTypeTwo);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Trans100.this,Trans100_1.class);
                startActivity(i);
            }
        });


        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Trans100.this,Trans100_2.class);
                startActivity(i);
            }
        });
    }
}
