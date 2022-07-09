package com.example.nbamanager.mapper;

import com.example.nbamanager.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * UserDAO继承基类
 */
@Repository
public interface UserDAO extends MyBatisBaseDao<User, User> {
    @Select("select * from user")
    public User getUser();
}