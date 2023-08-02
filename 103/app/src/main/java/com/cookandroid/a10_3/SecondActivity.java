package com.cookandroid.a10_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        setTitle("세컨드 액티비티");

        Intent intent = getIntent();
        String calc =(intent.getStringExtra("Calc"));
        int calValue=0;
        if (calc.equals("+")) {
            calValue = intent.getIntExtra("Num1", 0) + intent.getIntExtra("Num2", 0);
        } else if (calc.equals("-")) {
            calValue = intent.getIntExtra("Num1", 0) - intent.getIntExtra("Num2", 0);
        } else if (calc.equals("*")) {
            calValue = intent.getIntExtra("Num1", 0) * intent.getIntExtra("Num2", 0);
        } else {
            calValue = intent.getIntExtra("Num1", 0) / intent.getIntExtra("Num2", 0);
        }

        final int retValue = calValue;

        Button btnReturn = (Button)findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent outIntent = new Intent(getApplicationContext(), MainActivity.class);
                outIntent.putExtra("Hap", retValue);
                setResult(RESULT_OK, outIntent);
                finish();
        };
    });
}}