package com.fakemoneydetector.asr.fakemoneydetector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by jhjkmkl on 31-Aug-15.
 */
public class Details100_2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_layout_100_2);
        Button d1 = (Button)findViewById(R.id.d1);
        Button d2 = (Button)findViewById(R.id.d2);
        Button d3 = (Button)findViewById(R.id.d3);
        Button d4 = (Button)findViewById(R.id.d4);

        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Details100_2.this, D_100_2_d1.class);
                startActivity(i);
            }
        });
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Details100_2.this,D_100_2_d2.class);
                startActivity(i);
            }
        });
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Details100_2.this, D_100_2_d3.class);
                startActivity(i);
            }
        });
        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Details100_2.this, D_100_2_d4.class);
                startActivity(i);
            }
        });
    }
}
