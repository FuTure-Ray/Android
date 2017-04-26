package com.example.administrator.acttest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button1 = (Button) findViewById(R.id.button_1);
        Log.d("ActTest/1st.", "Task id is" + getTaskId());
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(FirstActivity.this, "Button 1 has been clicked",Toast.LENGTH_LONG).show();
//                Intent intent = new Intent("acttest.ACTION_START");
//                intent.addCategory("android.intent.category.MY_CATEGORY");
//                Intent intent = new Intent("acttest.activity.second");
//                intent.addCategory("acttest.activity.second");
//                String data = "EXTRA DATA!";
//                intent.putExtra("extra_data", data);
//                startActivity(intent);
//                startActivityForResult(intent,1);
                SecondActivity.actionStart(FirstActivity.this,"data1,666","data2,6666");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "Add item", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "Remove item", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    String returnedData = data.getStringExtra("data_return");
                    Toast.makeText(this, returnedData, Toast.LENGTH_SHORT).show();
                }
                break;
            default:
        }
    }
}
