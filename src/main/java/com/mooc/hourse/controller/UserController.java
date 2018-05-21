package com.mooc.hourse.controller;

import com.mooc.hourse.common.model.User;
import com.mooc.hourse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create by ling.zhang on 2018/4/1.
 */
@RestController
public class UserController {


    @Autowired
    private UserService userService;

    public List<User> selectUsers(){
        return userService.selectUsers();
    }
}
