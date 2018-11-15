package com.example.javablog.config;

import com.example.javablog.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 指明当前类是一个配置文件，代替spring配置文件
 */
@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中，容器中这个组件默认的id是方法名
    @Bean
    public HelloService helloService(){
        System.out.println("给容器中添加组件了");
        return new HelloService();
    }
}
