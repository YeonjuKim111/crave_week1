package com.cookandroid.a6_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnstart,btnstop;
        final ViewFlipper vFlipper;

        btnstart=(Button) findViewById(R.id.btnstart);
        btnstop=(Button) findViewById(R.id.btnstop);
        vFlipper=(ViewFlipper) findViewById(R.id.viewFlipper1);
        vFlipper.setFlipInterval(1000);

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vFlipper.startFlipping();
            }
        });
        btnstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vFlipper.stopFlipping();
            }
        });
    }
}