package com.demo.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author by itw_yangning01
 * @Classname Appliation
 * @Description TODO
 * @Date 2022/9/11 18:13:40
 */
@SpringBootApplication
@EnableScheduling
public class Appliation {
    public static void main(String[] args) {
        SpringApplication.run(Appliation.class,args);
    }
}
