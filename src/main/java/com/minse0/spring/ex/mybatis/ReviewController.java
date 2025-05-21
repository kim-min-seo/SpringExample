package com.minse0.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.minse0.spring.ex.mybatis.domain.Review;
import com.minse0.spring.ex.mybatis.service.ReviewService;

@Controller
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	// 전달받은 id와 일치하는 리뷰 정보를 responese에 json에 담는다
	@ResponseBody
    @RequestMapping("/mybatis/review/select/1")
	public Review review(@RequestParam("id") int id) {
//    	String idString = request.getParameter("id");
//    	int id = Integer.parseInt(idString);
    	
    	// 전달 받은 id와 일치하는 리뷰정보 알아도기
    	Review review = reviewService.getReview(id);
    	
    	return review;
    }
	
}
