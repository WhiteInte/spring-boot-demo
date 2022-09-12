package com.xkcoding.logback.controler;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author by itw_yangning01
 * @Classname testController
 * @Description TODO
 * @Date 2022/9/11 21:46:49
 */
@RestController
@Slf4j
public class testController {

    @GetMapping("/test")
    public void test(){
        UUID uuid = UUID.randomUUID();
        String uniqueId = uuid.toString().replace("-", "");
        MDC.put("traceId",uniqueId);
        log.info("测试traceid");
    }
}
