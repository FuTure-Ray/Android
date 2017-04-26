package com.example.administrator.acttest;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Log.d("ActTest/2nd.", "Task id is" + getTaskId());
//        final Intent intent = getIntent();
//        String data = intent.getStringExtra("extra_data");
//        Toast.makeText(this,data,Toast.LENGTH_SHORT).show();
        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent2 = new Intent();
//                intent2.putExtra("data_return", "IM RETURNED DATA");
//                setResult(RESULT_OK,intent2);
//                finish();
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }

    public static void actionStart(Context context,String data1,String data2){
        Intent intent = new Intent(context,SecondActivity.class);
        intent.putExtra("data1",data1);
        intent.putExtra("data2",data2);
        context.startActivity(intent);
    }
}
