package com.ch.oss.service;

import com.ch.oss.entity.User;

import java.util.ArrayList;

public interface UserService {

    int insert(User user);

    ArrayList<User> selectSelective(User record);
}
