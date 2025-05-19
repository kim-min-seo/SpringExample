package com.minse0.spring.ex.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class Ex02controller {
	
	@RequestMapping("/lifecycle/ex02")
	public String thymleafResponse() {
		// html 파일 경로 리턴
		// src/main/resources/templates 생략
		// .html 생략
		return "lifecycle/ex01";
	}
}
