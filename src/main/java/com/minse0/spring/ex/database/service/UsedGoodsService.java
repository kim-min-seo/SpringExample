package com.minse0.spring.ex.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minse0.spring.ex.database.domain.UsedGoods;
import com.minse0.spring.ex.database.repository.UsedGoodsRepository;

//로직 담당
@Service
public class UsedGoodsService {
	// 의존성 주입 - DI
	// 객체 생성을 Spring Framework 에서 직접 관리
	@Autowired
	private UsedGoodsRepository usedGoodsRepository;
	// 중고 게시글 모두 얻어오기
	public List<UsedGoods> getUsedGoodsList(){
		// used_goods 테이블 모든 행 조회
		// 중고 게시글 정보 얻어 오기
		List<UsedGoods> usedGoodList = usedGoodsRepository.selectUsedGoodsList();
		
		
		return usedGoodList;
		
	}
	
}
