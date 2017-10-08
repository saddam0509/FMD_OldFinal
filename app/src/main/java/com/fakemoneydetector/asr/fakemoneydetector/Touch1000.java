package com.fakemoneydetector.asr.fakemoneydetector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by jhjkmkl on 23-Aug-15.
 */
public class Touch1000 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.touch_layout_1000);

        ImageButton first = (ImageButton)findViewById(R.id.thousandTakaTypeOne);
        ImageButton second = (ImageButton)findViewById(R.id.thousandTakaTypeTwo);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Touch1000.this, Touch1000_1.class);
                startActivity(i);
            }
        });


        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Touch1000.this, Touch1000_2.class);
                startActivity(i);
            }
        });
    }
}
