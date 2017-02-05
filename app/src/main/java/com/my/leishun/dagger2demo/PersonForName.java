package com.my.leishun.dagger2demo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by leishun on 2017/2/5.
 * 通过字符串标记一个对象，容易导致前后不匹配，可以通过自定义注解的方式解决。
 */

@Qualifier      // 关键词
@Retention(RetentionPolicy.RUNTIME)   // 运行时仍可用
public @interface PersonForName {
}
