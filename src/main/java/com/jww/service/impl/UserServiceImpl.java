package com.jww.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import com.jww.service.UserService;
import com.jww.dao.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public String getPassword(String username,String password){
        String pass=userMapper.getPassword(username);
        if(pass.equals(password))
            return "true";
        else
            return "false";

    }
}
