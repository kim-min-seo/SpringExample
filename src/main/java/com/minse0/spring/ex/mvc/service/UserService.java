package com.minse0.spring.ex.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minse0.spring.ex.mvc.domain.User;
import com.minse0.spring.ex.mvc.repository.UserRepository;

@Service
public class UserService {
	// 가장 최근에 등록한 사용자 정보 얻어오기
	@Autowired
	private  UserRepository userRepository;
	
	public User getLastUser() {
		User user = userRepository.selectLastUser();
		
		return user;
	}
	
	public int addUser(
		User user	) {
		int count = userRepository.insertUser(user);
		
		return count;
	}
}
