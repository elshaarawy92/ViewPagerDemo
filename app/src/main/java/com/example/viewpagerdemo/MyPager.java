package com.example.viewpagerdemo;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class MyPager extends PagerAdapter {

    private List<View> myViewList;

    private final static String TAG = "MyPager";

    public MyPager(List<View> myViewList){
        this.myViewList = myViewList;
    }

    @Override
    public int getCount() {
        return myViewList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(myViewList.get(position));
        Log.d(TAG, "instantiateItem: " + myViewList.get(position));
        return myViewList.get(position);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(myViewList.get(position));
    }
}
