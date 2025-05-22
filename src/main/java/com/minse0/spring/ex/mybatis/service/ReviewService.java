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
	// sellerId, 메뉴, 작성자, 별점, 리뷰 저장 가능
	public int addReview(int storeId
			, String menu
			, String userName
			, double point
			, String review){
		int count = reviewRepository.insertReview(storeId, menu, userName, point, review);
		
		return count;
	}
	// Review 객체를 통해 리뷰 정보를 저장하는 기능
	public int  addReviewByObject(Review review) {
		int count = reviewRepository.insertReviewByObject(review);
		
		return count;
	}
}
