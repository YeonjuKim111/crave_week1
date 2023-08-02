package com.cookandroid.a9_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyGraphicView(this));
    }
    private static class MyGraphicView extends View {
        public MyGraphicView(Context context){
            super(context);
        }
        @Override
        protected void onDraw(Canvas canvas){
            super.onDraw(canvas);
            Paint paint =new Paint();
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setColor(Color.BLACK);
            paint.setStrokeWidth(50);
            canvas.drawLine(30,20,400,20,paint);

            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setColor(Color.BLACK);
            canvas.drawLine(20,80,500,80,paint);


            RectF rect = new RectF();
            rect.set(100, 200, 100 + 400, 100 + 200);
            canvas.drawOval(rect, paint);

            rect.set(100, 300, 100 + 200, 300 + 200);
            canvas.drawArc(rect, 40, 100, true, paint);

            paint.setColor(Color.BLUE);
            rect.set(100, 600, 100 + 200, 600 + 200);
            canvas.drawRect(rect, paint);

            paint.setColor(Color.argb(0x88, 0xff, 0x00, 0x00));
            rect.set(150, 650, 150 + 200, 650 + 200);
            canvas.drawRect(rect, paint);

        }
    }
}