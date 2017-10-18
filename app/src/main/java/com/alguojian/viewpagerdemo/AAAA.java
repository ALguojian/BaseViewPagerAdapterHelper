package com.alguojian.viewpagerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AAAA extends AppCompatActivity implements View.OnClickListener {

    protected Button button;
    protected Button button2;
    protected Button button3;
    protected Button button4;
    protected Button button5;
    protected Toolbar toolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_aaa);
        initView();
        setSupportActionBar(toolBar);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            MainActivity.start(this, 1);
        } else if (view.getId() == R.id.button2) {
            MainActivity.start(this, 2);
        } else if (view.getId() == R.id.button3) {
            MainActivity.start(this, 3);
        } else if (view.getId() == R.id.button4) {
            MainActivity.start(this, 4);
        } else if (view.getId() == R.id.button5) {
            MainActivity.start(this, 5);
        }
    }

    private void initView() {
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(AAAA.this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(AAAA.this);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(AAAA.this);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(AAAA.this);
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(AAAA.this);
        toolBar = (Toolbar) findViewById(R.id.toolBar);
    }
}
