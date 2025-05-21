package com.minse0.spring.ex.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minse0.spring.ex.mybatis.domain.Review;
import com.minse0.spring.ex.mybatis.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;
	// new_review 테이블에서 전달 받은 id와 일치하는 행 조회
	
	public Review getReview(int id) {
		
		Review review = reviewRepository.selectReview(id);
		
		return review;
	}
}
