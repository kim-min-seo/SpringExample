package com.minse0.spring.ex.database.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.minse0.spring.ex.database.domain.UsedGoods;




// 데이터 베이스 관련 처리 (query 수행)
// mybatis Framework 
@Mapper
public interface UsedGoodsRepository {
	
	// used_goods 모든 행 조회
	public List<UsedGoods> selectUsedGoodsList();
}
