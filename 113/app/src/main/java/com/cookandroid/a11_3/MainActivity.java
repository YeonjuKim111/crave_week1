package com.cookandroid.a11_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("스피너 테스트");

        final String[] movie = { "쿵푸팬더", "짱구는 못말려", "아저씨", "아바타", "대부", "국가대표",
                "토이스토리3", "마당을 나온 암탉", "죽은 시인의 사회", "서유기" };

        final Integer[] posterID = { R.drawable.rabbit, R.drawable.rabbit,
                R.drawable.rabbit, R.drawable.rabbit, R.drawable.rabbit,
                R.drawable.rabbit, R.drawable.rabbit, R.drawable.rabbit,
                R.drawable.rabbit, R.drawable.rabbit };
        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter;
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,movie);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                ImageView ivPoster = findViewById(R.id.ivPoster);
                ivPoster.setScaleType(ImageView.ScaleType.FIT_CENTER);
                ivPoster.setPadding(5, 5, 5, 5);
                ivPoster.setImageResource(posterID[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}