package com.minse0.spring.ex.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minse0.spring.ex.jpa.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}
