package com.fakemoneydetector.asr.fakemoneydetector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by jhjkmkl on 26-Aug-15.
 */
public class Trans1000 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transparency_layout_1000);

        ImageButton first = (ImageButton)findViewById(R.id.thousandTakaTypeOne);
        ImageButton second = (ImageButton)findViewById(R.id.thousandTakaTypeTwo);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Trans1000.this,Trans1000_1.class);
                startActivity(i);
            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Trans1000.this,Trans1000_2.class);
                startActivity(i);
            }
        });
    }
}
