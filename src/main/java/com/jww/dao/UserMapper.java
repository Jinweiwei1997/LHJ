package com.jww.dao;

import org.apache.ibatis.annotations.Mapper;

public interface UserMapper {
    String getPassword(String username);
}
