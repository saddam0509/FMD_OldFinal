package com.fakemoneydetector.asr.fakemoneydetector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by jhjkmkl on 23-Aug-15.
 */
public class Touch100 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.touch_layout_100);

        ImageButton first = (ImageButton)findViewById(R.id.hundredTakaTypeOne);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Touch100.this, Touch100_1.class);
                startActivity(i);
            }
        });

        ImageButton second = (ImageButton)findViewById(R.id.hundredTakaTypeTwo);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Touch100.this,Touch100_2.class);
                startActivity(i);
            }
        });


    }
}
