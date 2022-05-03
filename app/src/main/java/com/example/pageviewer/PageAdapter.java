package com.example.pageviewer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class PageAdapter extends PagerAdapter {


    private Context mContext;

    public PageAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public java.lang.Object instantiateItem(@NonNull ViewGroup container, int position) {
        Object modelObject = Object.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);

        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject.getmLayoutResId(),container,false);

        container.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull java.lang.Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return Object.values().length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull java.lang.Object object) {
        return view==object;
    }

    public CharSequence getPageTitle(int position){
        Object customPageEnum = Object.values()[position];
        return mContext.getString(customPageEnum.getmTitleResId());
    }
}
