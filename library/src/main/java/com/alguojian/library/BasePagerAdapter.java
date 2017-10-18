package com.alguojian.library;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by ALguojian
 * on 2017/10/18.
 */

public  class BasePagerAdapter<T extends View> extends PagerAdapter {

    private List<T>mList;

    public BasePagerAdapter(List<T> list) {
        this.mList = list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public  Object instantiateItem(ViewGroup container, int position){
        container.addView(mList.get(position));
        return mList.get(position);
    };

    @Override
    public  void destroyItem(ViewGroup container, int position, Object object){
        container.removeView(mList.get(position));
    };


}
