package com.ch.oss.dao;

import com.ch.oss.entity.Message;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageMapper {
    int insert(Message record);

    int insertSelective(Message record);
}