package com.alguojian.viewpagerdemo;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.alguojian.library.BaseFragmentPagerAdapter;
import com.alguojian.library.BasePagerAdapter;
import com.alguojian.library.InPageTransformer;
import com.alguojian.library.OutPageTransformer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    protected ViewPager viewPager;
    private List<ImageView> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        init();
    }

    private void init() {

        list = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.mipmap.ic_launcher);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            list.add(imageView);
        }

        //添加滑动动画，boolean标识是否滑动时透明
        viewPager.setPageTransformer(false, new InPageTransformer());

        viewPager.setAdapter(new BasePagerAdapter<>(list));


    }

}
