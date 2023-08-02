package com.cookandroid.a10_3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private EditText etNum1, etNum2;
    private Button btnNewActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("메인 액티비티");
        final RadioGroup rdoGroup = (RadioGroup) findViewById(R.id.rdoGroup);
        Button btnNewActivity = (Button) findViewById(R.id.btnNewActivity);

        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                EditText etNum1 =(EditText) findViewById(R.id.etNum1);
                EditText etNum2 = (EditText) findViewById(R.id.etNum2);
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                switch (rdoGroup.getCheckedRadioButtonId()) {
                    case R.id.add:
                        intent.putExtra("Calc", "+");
                        break;
                    case R.id.sub:
                        intent.putExtra("Calc", "-");
                        break;
                    case R.id.mul:
                        intent.putExtra("Calc", "*");
                        break;
                    case R.id.div:
                        intent.putExtra("Calc", "/");
                        break;
                    default:
                        break;
            }

            intent.putExtra("Num1", Integer.parseInt(etNum1.getText().toString()));
            intent.putExtra("Num1", Integer.parseInt(etNum2.getText().toString()));
            startActivityForResult(intent,0);
        };
    });

}

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK){
            int hap=data.getIntExtra("Hap",0);
            Toast.makeText(getApplicationContext(),"합계 :"+hap,Toast.LENGTH_SHORT).show();
        }
    }}