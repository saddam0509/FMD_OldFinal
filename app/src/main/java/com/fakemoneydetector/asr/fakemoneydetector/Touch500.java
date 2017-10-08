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
public class Touch500 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.touch_layout_500);

        ImageButton first = (ImageButton)findViewById(R.id.fiveHundredTakaTypeOne);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Touch500.this, Touch500_1.class);
                startActivity(i);
            }
        });

        ImageButton second = (ImageButton)findViewById(R.id.fiveHundredTakaTypeTwo);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Touch500.this,Touch500_2.class);
                startActivity(i);
            }
        });
    }
}
