package com.music.view;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.music.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by 樊雷雷 on 2017/6/28.
 */

public class SplashAcitvity extends BaseActivity {

    Handler handler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            inittoNext();
            SplashAcitvity.this.finish();
        }
    };
    @BindView(R.id.splash_iv)
    ImageView splashIv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        handler.sendEmptyMessageDelayed(1, 3000);

    }


    @OnClick(R.id.splash_iv)
    public void onViewClicked() {
        handler.removeMessages(1);
        inittoNext();
        SplashAcitvity.this.finish();
    }
}
