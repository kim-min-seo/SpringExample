package com.minse0.spring.ex.mvc.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.minse0.spring.ex.mvc.domain.User;

@Mapper
public interface UserRepository {
	
	public User selectLastUser();
	
	public int insertUser(User user);
	
	// 전달 받은 email이 포함된 행의 개수
	public int selectCountryByEmail(@Param("email") String email);
}
