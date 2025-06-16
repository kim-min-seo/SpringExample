package com.minse0.spring.ex.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minse0.spring.ex.jpa.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	// 모든 행을 id기반으로 내림차순 조회
	// ORDER BY `id` DESC;
	public List<Student> findAllByOrderByIdDesc();
	
	// id 기반으로 내림차순 2개만 조회
	// ORDER BY `id` DESC LIMIT 2
	public List<Student> findTop2ByOrderByIdDesc();
}
