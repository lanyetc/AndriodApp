package com.example.lanyetc.campusgo.ui.activity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.lanyetc.campusgo.R;

/**
 * Created by ZHANGXY on 2018/3/25.
 */

public class libActivity extends AppCompatActivity implements View.OnClickListener{
    private Button backbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.lib_detail);

        backbtn = findViewById(R.id.lib_back);
        backbtn.setOnClickListener(this);


        //实现透明状态栏
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {//5.0及以上
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {//4.4到5.0
            WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
            localLayoutParams.flags = (WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS | localLayoutParams.flags);
        }
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lib_back:
                //Intent intent =new Intent(lostAndFoundActivity.this,MenuActivity.class);
                //startActivity(intent);
                finish();
                break;
        }
    }
}
