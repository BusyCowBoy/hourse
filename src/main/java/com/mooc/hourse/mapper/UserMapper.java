package com.mooc.hourse.mapper;

import com.mooc.hourse.common.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Create by ling.zhang on 2018/4/1.
 */
@Mapper
public interface UserMapper {

    List<User> selectUsers();
}
