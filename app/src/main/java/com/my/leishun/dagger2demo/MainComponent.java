package com.my.leishun.dagger2demo;

import dagger.Component;

/**
 * Created by leishun on 2017/2/5.
 * 创建单例对象需添加 ：@Singleton
 */

// 作为桥梁，沟通调用者和依赖对象库
@Component(modules = MainModule.class)
public interface MainComponent {

    //定义注入的方法
    void inject(MainActivity activity);
}
