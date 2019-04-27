package com.zxl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zxl on 2019/4/27.
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("/aop")
    public String testAop(){
        System.out.println("测试结果");
        return "aop";
    }

}
