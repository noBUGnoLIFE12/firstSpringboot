package com.example.demo.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.example.demo.bean.IUser;

@Mapper
public interface UserMapper {
	public IUser queryUser(String accountID);
}
