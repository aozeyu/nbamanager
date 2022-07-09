package com.example.nbamanager.service.impl;

import com.example.nbamanager.entity.User;
import com.example.nbamanager.mapper.UserDAO;
import com.example.nbamanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: nbamanager
 * @description: 33
 * @packagename: com.example.nbamanager.service.impl
 * @author: 姚泽宇
 * @date: 2022-07-09 09:34
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Override
    public User getUser() {
        return userDAO.getUser();
    }
}
