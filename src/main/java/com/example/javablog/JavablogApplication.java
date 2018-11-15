package com.example.javablog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 *  @SpringBootApplication 来标注一个主程序，说明是springboot应用
 *  @ImportResource 加载spring的配置文件，让其生效
 */
//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class JavablogApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavablogApplication.class, args);
    }
}
