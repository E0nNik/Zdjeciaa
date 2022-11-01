package com.example.zdjeciaa;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;


public class MainActivity extends AppCompatActivity {

    ImageView zdjecie;
    SeekBar SeekP, SeekS, SeekR, Seek4, Seek5, Seek6;
    int r=255,g=255,blue=255;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekP = (SeekBar) findViewById(R.id.seek1);
        SeekS = (SeekBar) findViewById(R.id.Seek2);
        SeekR = (SeekBar) findViewById(R.id.Seek3);
        Seek4 = (SeekBar) findViewById(R.id.Seek4);
        Seek5 = (SeekBar) findViewById(R.id.Seek5);
        Seek6 = (SeekBar) findViewById(R.id.Seek6);
        zdjecie = (ImageView) findViewById(R.id.zdjecie);
        SeekP.setProgress(255);

        SeekP.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                zdjecie.setImageAlpha(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        SeekS.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                zdjecie.setScaleX(i);
                zdjecie.setScaleY(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        SeekR.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                zdjecie.setRotation(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });


        Seek4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                r = i;
                kolor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        Seek5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                g = i;
                kolor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        Seek6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                blue = 1;
                kolor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });


    }
    public void kolor() {
        zdjecie.setColorFilter(Color.rgb(r,g,blue), PorterDuff.Mode.MULTIPLY);
    }
}