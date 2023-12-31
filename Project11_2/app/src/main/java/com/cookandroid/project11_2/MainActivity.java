package com.cookandroid.project11_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("갤러리 영화 포스터");

        Gallery gallery = (Gallery) findViewById(R.id.gallery1);

        MyGalleryAdapter galAdapter = new MyGalleryAdapter(this);
        gallery.setAdapter(galAdapter);

    }
    public class MyGalleryAdapter extends BaseAdapter {

        Context context;
        Integer[] posterID = {R.drawable.rabbit, R.drawable.rabbit,
                R.drawable.rabbit, R.drawable.rabbit, R.drawable.rabbit,
                R.drawable.rabbit, R.drawable.rabbit, R.drawable.rabbit,
                R.drawable.rabbit, R.drawable.rabbit};

        @Override
        public int getCount() {
            return posterID.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }
        String[] posterTitle = {"여인의 향기", "쥬라기 공원", "포레스트 검프", "사랑의 블랙홀",
                "혹성탈출", "아름다운비행", "내이름은 칸", "해리포터", "마더", "킹콩을 들다"};
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageview = new ImageView(context);
            imageview.setLayoutParams(new ViewGroup.LayoutParams(200,300));
            imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageview.setPadding(5,5,5,5);
            imageview.setImageResource(posterID[position]);

            final int pos= position;
            imageview.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    ImageView ivPoster=(ImageView) findViewById(R.id.ivPoster);
                    ivPoster.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    ivPoster.setImageResource(posterID[pos]);

                    Toast toast = new Toast(getApplicationContext());
                    View toastView = View.inflate(getApplicationContext(), R.layout.toast, null);
                    TextView toastText = toastView.findViewById(R.id.textView1);
                    toastText.setText(posterTitle[pos]);
                    toast.setView(toastView);
                    toast.show();


                    return false;

                    }
                });
            return imageview;

        }

        public MyGalleryAdapter(Context c) {
            context = c;
        }
}}