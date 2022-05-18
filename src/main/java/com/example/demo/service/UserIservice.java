package com.example.demo.service;


import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.example.demo.bean.IUser;
import com.example.demo.mapper.UserMapper;

@ComponentScan({ "mapper" })
@Service("userService")
public class UserIservice implements UserService {
	@Resource
    private UserMapper userMapper;
    @Resource
    private MessageSource messageSource;
    @Override 
    public IUser queryUser(String accountId) {
    return userMapper.queryUser(accountId);
}
}