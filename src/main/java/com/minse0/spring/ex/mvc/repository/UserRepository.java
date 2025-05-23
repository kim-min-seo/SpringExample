package com.minse0.spring.ex.mvc.repository;

import org.apache.ibatis.annotations.Mapper;

import com.minse0.spring.ex.mvc.domain.User;

@Mapper
public interface UserRepository {
	
	public User selectLastUser();
}
