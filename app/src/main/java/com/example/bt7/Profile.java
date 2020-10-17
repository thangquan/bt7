package com.example.bt7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;


public class Profile extends AppCompatActivity {
    private ViewPager mviewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        InitView();
    }

    private void InitView() {
        mviewPager= (ViewPager) findViewById(R.id.page1);
        mviewPager.setAdapter(new com.example.bt7.TabAdapter(getSupportFragmentManager()));
        TabLayout mtabLayout= (TabLayout) findViewById(R.id.tab1);
        mtabLayout.setupWithViewPager(mviewPager);
    }
}