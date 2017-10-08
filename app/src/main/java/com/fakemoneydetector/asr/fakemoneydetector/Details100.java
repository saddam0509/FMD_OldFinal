package com.fakemoneydetector.asr.fakemoneydetector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by jhjkmkl on 27-Aug-15.
 */
public class Details100 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_layout_100);
        ImageButton first = (ImageButton)findViewById(R.id.hundredTakaTypeOne);
        ImageButton second = (ImageButton)findViewById(R.id.hundredTakaTypeTwo);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Details100.this,Details100_1.class);
                startActivity(i);
            }
        });


        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Details100.this,Details100_2.class);
                startActivity(i);
            }
        });
    }
}
