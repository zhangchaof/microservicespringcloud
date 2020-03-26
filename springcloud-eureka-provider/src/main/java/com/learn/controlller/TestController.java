package com.learn.controlller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: microservicespringcloud:TestController
 * @description:
 * @author: clark
 * @create: 2020-03-26 10:23
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
