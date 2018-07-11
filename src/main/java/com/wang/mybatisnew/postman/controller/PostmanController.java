package com.wang.mybatisnew.postman.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author wly
 * @Date 2018/7/9 12:51
 */
@RestController
@RequestMapping("/postman")
public class PostmanController {

    @RequestMapping("/print")
    public String printNumber(Integer number) {
        System.out.println(number);
        return "The number is ：" + number;
    }
}
