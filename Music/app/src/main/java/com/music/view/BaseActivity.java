package com.music.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import com.music.MainActivity;

/**
 * Created by 樊雷雷 on 2017/6/28.
 */

public class BaseActivity extends AppCompatActivity {
    public  void inittoNext(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
