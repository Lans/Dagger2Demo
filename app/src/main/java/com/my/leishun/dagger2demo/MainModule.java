package com.my.leishun.dagger2demo;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

/**
 * Created by leishun on 2017/2/5.
 * <p>
 * 存放实例对象
 *
 * @Singleton:实现单例
 */

@Module
public class MainModule {

    // 关键字，标明该方法提供依赖对象
    @Provides
    // @Singleton
    Person providerPerson() {
        //提供Person对象
        Log.e("dagger", " from Module");
        return new Person();
    }

    @PersonForName
    @Provides
    Person providePerson() {
        return new Person("有参构造");
    }

}
