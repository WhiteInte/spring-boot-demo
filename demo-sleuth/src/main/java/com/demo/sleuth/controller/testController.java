package com.demo.sleuth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by itw_yangning01
 * @Classname testController
 * @Description TODO
 * @Date 2022/9/11 20:36:06
 */
@RestController
@Slf4j
public class testController {

    @GetMapping("/testSleuth")
    public void test(){
        log.info("sleuth测试");
    }
}
