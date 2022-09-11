package com.demo.sleuth.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author by itw_yangning01
 * @Classname testTask
 * @Description TODO
 * @Date 2022/9/11 21:13:54
 */
@Component
@Slf4j
public class testTask {

    @Scheduled(cron = "1 * * * * *")
    public void test(){
        log.info("定时任务");
    }
}
