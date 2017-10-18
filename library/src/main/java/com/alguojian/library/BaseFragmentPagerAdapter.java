package com.alguojian.library;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by ALguojian
 * on 2017/10/18.
 */

public class BaseFragmentPagerAdapter<T extends Fragment> extends FragmentPagerAdapter {

    private List<T> list;
    private List<String> strings;

    public BaseFragmentPagerAdapter(FragmentManager fm, List<T> list, List<String> strings) {
        super(fm);
        this.list = list;
        this.strings = strings;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return null == strings ? super.getPageTitle(position) : strings.get(position);
    }
}
