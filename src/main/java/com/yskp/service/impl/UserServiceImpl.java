package com.yskp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yskp.bean.User;
import com.yskp.dao.UserMapper;
import com.yskp.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserMapper userDao;
    
    @Override
    public User getUserById(int userId) {

        return this.userDao.selectByPrimaryKey(userId);

    }

}
