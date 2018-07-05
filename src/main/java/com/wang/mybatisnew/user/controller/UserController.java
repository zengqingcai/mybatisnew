package com.wang.mybatisnew.user.controller;


import com.wang.mybatisnew.user.domain.User;
import com.wang.mybatisnew.user.service.MPUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author wly
 * @since 2018-07-04
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private MPUserService userService;

    @RequestMapping("/test")
    public String test() {
        // 增
        User user = new User();
        user.setUserName("张三");
        user.setUserSex(0);
        user.setUserAddress("北美K2");
        userService.insert(user);
        // 查
        System.out.println( userService.selectById(user.getId()));
        // 改
        user.setUserAddress("北美K3");
        // 查
        System.out.println( userService.selectById(user.getId()));
        // 删
        userService.deleteById(user.getId());
        // 查
        System.out.println( userService.selectById(user.getId()));
        return "done";
    }
}

