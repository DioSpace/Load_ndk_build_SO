package com.my.loadobasedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.my.ndkdynamicdemo.util.MyUtil;

public class MainActivity extends AppCompatActivity {

    private TextView showText;
    private MyUtil myUtil;
    private com.my.ndkstaticdemo.util.MyUtil myUtil_static;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showText = findViewById(R.id.textBloardId);
        myUtil = new MyUtil();
        myUtil_static = new com.my.ndkstaticdemo.util.MyUtil();
    }

    public void click2_static(View view) {
        String str = myUtil_static.stringFromJNI2();
        showText.setText(str);
    }

    public void click3_static(View view) {
        String str = myUtil_static.handleString("param string");
        showText.setText(str);
    }

    public void click1_dynamic(View view) {
        String result = myUtil.getHello();
        showText.setText(result);
    }

    public void click2_dynamic(View view) {
        int result = myUtil.meaningOfTheUniverse();
        showText.setText("返回值：" + result);
    }

}