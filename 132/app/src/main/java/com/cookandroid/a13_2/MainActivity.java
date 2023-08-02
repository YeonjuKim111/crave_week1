package com.cookandroid.a13_2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mPlayer;
        mPlayer = MediaPlayer.create(this, R.raw.song1);
        final Switch switch1 = (Switch) findViewById(R.id.switch1);
        SeekBar seekBar1=(SeekBar) findViewById(R.id.seekBar1);

        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switch1.isChecked()){
                    mPlayer.start();

                    new Thread() {
                        public void run() {
                            if (mPlayer == null) return;
                            seekBar1.setMax(mPlayer.getDuration());
                            while (mPlayer.isPlaying()) {
                                seekBar1.setProgress(mPlayer.getCurrentPosition());
                                SystemClock.sleep(200);
                            }
                            seekBar1.setProgress(0);
                        }
                    }.start();

                }
                else{mPlayer.stop();}
            }
        });

        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser){
                    mPlayer.seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }}


