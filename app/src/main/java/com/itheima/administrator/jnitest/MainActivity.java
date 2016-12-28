package com.itheima.administrator.jnitest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;

public class MainActivity extends AppCompatActivity {
    private JniTest test;
    @ViewInject(R.id.tv)
    private TextView tv;
    @OnClick({R.id.bt})
    private void click(View view){
        tv.setText(test.showWords());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewUtils.inject(this);
        test=new JniTest();
    }
}
