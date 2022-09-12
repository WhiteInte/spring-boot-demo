package com.example.beanCopy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author by itw_yangning01
 * @Classname appliction
 * @Description TODO
 * @Date 2022/9/12 17:59:14
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.example.beanCopy.mapper"})
public class appliction {
    public static void main(String[] args) {

        SpringApplication.run(appliction.class,args);
    }
}
