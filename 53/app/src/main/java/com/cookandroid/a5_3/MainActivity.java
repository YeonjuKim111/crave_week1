package com.cookandroid.a5_3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout baseLayout=new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor((Color.rgb(255,255,255)));
        setContentView(baseLayout,params);

        EditText edit = new EditText(this);
        edit.setText("IT Cookbook. Android");
        baseLayout.addView(edit);

        Button btn=new Button(this);
        btn.setText("버튼입니다");
        btn.setBackgroundColor(Color.YELLOW);
        baseLayout.addView(btn);

        TextView text=new TextView(this);
        text.setTextColor(Color.MAGENTA);
        text.setTextSize(20);
        baseLayout.addView(text);

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                text.setText(edit.getText().toString());
            }
        });

    }
}