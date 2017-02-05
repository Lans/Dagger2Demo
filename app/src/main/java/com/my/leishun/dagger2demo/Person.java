package com.my.leishun.dagger2demo;

import android.util.Log;

/**
 * Created by leishun on 2017/2/5.
 * 创建一个javabean
 */

public class Person {
    private static final String TAG = "Person";
    private String name;
    private String pwd;

    public Person() {
        Log.e(TAG, "new person");
    }

    public Person(String name) {
        this.name = name;
        Log.e(TAG, "new person('name')");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
