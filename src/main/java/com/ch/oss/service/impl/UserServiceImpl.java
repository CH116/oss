package com.ch.oss.service.impl;

import com.ch.oss.dao.UserMapper;
import com.ch.oss.entity.User;
import com.ch.oss.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public ArrayList<User> selectSelective(User record) {
        return userMapper.selectSelective(record);
    }


}
