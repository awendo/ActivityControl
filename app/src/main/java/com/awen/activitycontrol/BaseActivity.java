package com.awen.activitycontrol;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2017/7/31.
 */

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityControl.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityControl.removeActivity(this);
    }
}
