package com.mooc.hourse.service;

import com.mooc.hourse.common.model.User;
import com.mooc.hourse.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by ling.zhang on 2018/4/1.
 */

@Service
public class UserService {


    @Autowired
    private UserMapper userMapper;

    public List<User> selectUsers(){
        return userMapper.selectUsers();
    }
}
