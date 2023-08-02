package com.cookandroid.a7_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("동물들");
        edit1=(EditText) findViewById(R.id.Edit1);
        img=(ImageView) findViewById(R.id.imgView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater=getMenuInflater();
        mInflater.inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.rotate:
                img.setRotation(Integer.parseInt(edit1.getText().toString()));
                return true;
            case R.id.item1:
                img.setImageResource(R.drawable.dog);
                return true;
            case R.id.item2:
                img.setImageResource(R.drawable.cat);
                return true;
            case R.id.item3:
                img.setImageResource(R.drawable.rabbit);
                return true;


        }
        return false;
    }
}