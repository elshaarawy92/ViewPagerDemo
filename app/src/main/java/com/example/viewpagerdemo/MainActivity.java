package com.example.viewpagerdemo;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    private List<View> myViewList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.in_viewpager);
        myViewList = new ArrayList<>();
        LayoutInflater layoutInflater = getLayoutInflater().from(MainActivity.this);
        View view1 = layoutInflater.inflate(R.layout.layout1,null);
        View view2 = layoutInflater.inflate(R.layout.layout2,null);
        View view3 = layoutInflater.inflate(R.layout.layout3,null);
        myViewList.add(view1);
        myViewList.add(view2);
        myViewList.add(view3);
        viewPager.setAdapter(new MyPager(myViewList));
        viewPager.setPageTransformer(true,new DepthPageTransformer());
    }
}
