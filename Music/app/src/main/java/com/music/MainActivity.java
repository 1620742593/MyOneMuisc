package com.music;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity  {
    @BindView(R.id.bendi)
    ImageView bendi;
    @BindView(R.id.yueku)
    ImageView yueku;
    @BindView(R.id.gequfenxiang)
    ImageView gequfenxiang;
    @BindView(R.id.activity_main)
    RelativeLayout activityMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.bendi, R.id.yueku, R.id.gequfenxiang})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bendi:

                break;
            case R.id.yueku:

                break;
            case R.id.gequfenxiang:

                break;
        }
    }
}
