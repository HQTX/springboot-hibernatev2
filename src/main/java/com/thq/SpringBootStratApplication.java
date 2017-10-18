package com.thq;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by THQ
 * 2017/10/17.
 * 继承SpringBootServletInitializer
 * 重写configure 方法
 * 将SpringBootApplication类加入当中
 * 实现jar 转为war
 *
 */
public class SpringBootStratApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return  builder.sources(CeshiApplication.class);
    }
}
