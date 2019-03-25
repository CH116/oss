package com.ch.oss.dao;

import com.ch.oss.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;
/**
 * @Author: chenhao  2019/3/15 10:36
 */
public class UserMapperTest {

    private ApplicationContext applicationContext;

    @Autowired
    private UserMapper userMapper;

    @Before
    public void setUp() throws Exception {
        // 加载spring配置文件
        applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 导入需要测试的
        userMapper = applicationContext.getBean(UserMapper.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testInsert() {
        // 加载spring配置文件
        applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 导入需要测试的
        User user = new User();
        user.setUsername("ch");
        user.setPassword("123");
        int result = userMapper.insert(user);
        System.out.print("结果为:"+result);
        assert(result == 1);
    }
}