package com.example.javablog;

import com.example.javablog.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JavablogApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService(){
       boolean b = ioc.containsBean("helloService");
       System.out.println(b);
    }

    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads() {

        /**
         * 日志的级别，由低到高，可以调整输出的日志级别
         */
        logger.trace("这是trace日志");
        logger.debug("这是debug日志");
        logger.info("这是info日志");
        logger.warn("这是warn日志");
        logger.error("这是error日志");
//        System.out.println(person);
    }

}
