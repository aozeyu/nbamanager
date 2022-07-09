package com.example.nbamanager.controller;

import com.example.nbamanager.entity.User;
import com.example.nbamanager.service.impl.UserServiceImpl;
import com.example.nbamanager.utils.Result;
import com.example.nbamanager.utils.ResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: nbamanager
 * @description: 登陆
 * @packagename: com.example.nbamanager.controller
 * @author: 姚泽宇
 * @date: 2022-07-09 09:32
 **/
@RestController
@RequestMapping("/")
public class LoginController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/user")
    public Result getUser() {
        Result result;
        User user = userService.getUser();
        result = ResultResponse.getSuccessResult(user);
        return result;
    }
}
