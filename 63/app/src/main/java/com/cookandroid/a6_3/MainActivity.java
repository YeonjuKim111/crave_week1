package com.cookandroid.a6_3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;
@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabDog = tabHost.newTabSpec("Dog").setIndicator("강아지");
        tabDog.setContent(R.id.tabDog);
        tabHost.addTab(tabDog);

        TabHost.TabSpec tabCat = tabHost.newTabSpec("Cat").setIndicator("고양이");
        tabCat.setContent(R.id.tabCat);
        tabHost.addTab(tabCat);

        TabHost.TabSpec tabRabbit = tabHost.newTabSpec("Rabbit").setIndicator("토끼");
        tabRabbit.setContent(R.id.tabRabbit);
        tabHost.addTab(tabRabbit);

        TabHost.TabSpec tabHorse = tabHost.newTabSpec("Horse").setIndicator("말");
        tabHorse.setContent(R.id.tabHorse);
        tabHost.addTab(tabHorse);

        tabHost.setCurrentTab(0);
    }
}

