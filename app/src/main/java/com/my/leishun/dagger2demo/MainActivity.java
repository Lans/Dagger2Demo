package com.my.leishun.dagger2demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

/**
 * @Module:作为实例对象的容器。
 * @Provides:标注能够提供实例化对象的方法。
 * @Component:作为桥梁，注入对象的通道。
 * @Inject：需要注入的方法 注意：DaggerMainComponent该类需要编译(ReBuild)之后才会生成
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Inject
    Person person;

    @PersonForName // 标记
    @Inject
    Person person2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 构造桥梁对象
        MainComponent mainComponent = DaggerMainComponent.builder().mainModule(new MainModule()).build();
        //注入
        mainComponent.inject(this);

        person.setName("Dagger2");
        person.setPwd("google");

        Log.e(TAG, person.toString() + "\n" + person2.toString());
    }
}
