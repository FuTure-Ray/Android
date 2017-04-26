package com.example.administrator.acttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ThirdActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ActTest/3rd.","Task id is " + getTaskId());
        setContentView(R.layout.third_layout);
    }
}
