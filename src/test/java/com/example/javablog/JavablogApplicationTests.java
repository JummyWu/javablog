package com.example.javablog;

import com.example.javablog.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JavablogApplicationTests {

    @Autowired
    Person person;

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
