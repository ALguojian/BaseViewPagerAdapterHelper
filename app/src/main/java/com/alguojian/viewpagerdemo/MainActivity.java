package com.alguojian.viewpagerdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.alguojian.library.BasePagerAdapter;
import com.alguojian.library.InPageTransformer;
import com.alguojian.library.OutPageTransformer;
import com.alguojian.library.RotateDownPageTransformer;
import com.alguojian.library.RotateUpPageTransformer;
import com.alguojian.library.RotateYTransformer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    protected ViewPager viewPager;
    private List<ImageView> list;
    private BasePagerAdapter<ImageView> imageViewBasePagerAdapter;
    private int aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        aa = getIntent().getIntExtra("aa", 1);
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
        viewPager.setPageTransformer(true, new OutPageTransformer());

        switch (aa) {
            case 1:
                viewPager.setPageTransformer(true, new InPageTransformer());
                break;
            case 2:
                viewPager.setPageTransformer(true, new OutPageTransformer());
                break;
            case 3:
                viewPager.setPageTransformer(true, new RotateYTransformer());
                break;
            case 4:
                viewPager.setPageTransformer(true, new RotateUpPageTransformer());
                break;
            case 5:
                viewPager.setPageTransformer(true, new RotateDownPageTransformer());
                break;
            default:
                break;
        }

        imageViewBasePagerAdapter = new BasePagerAdapter<>(list);
        viewPager.setAdapter(imageViewBasePagerAdapter);
    }

    public static void start(Context context, int aa) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra("aa", aa);
        context.startActivity(intent);
    }
}
