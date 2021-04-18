package com.statistics.controller;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.statistics.domain.AccessInternetBankingStatistics;
import com.statistics.persistence.AccessInternetBankingStatisticsRepository;

@RestController
@RequestMapping("/statistics")
public class StatisticsController {

	@Autowired
	AccessInternetBankingStatisticsRepository repo;
	
	/***
	 * 인터넷뱅킹 서비스 접속 기기 목록을 모두 출력
	 * @return
	 */
	@PostMapping("/select")
	public ResponseEntity<?> selectStatistics(){
		Iterable<AccessInternetBankingStatistics> data;
		data = repo.findAll();
		return ResponseEntity.ok(data);
	}
	
	/***
	 * 인터넷뱅킹 서비스 접속 기기 목록 중 해당 년도만 출력
	 * @param data
	 * @return
	 */
	
	@PostMapping("/selectYear")
	public ResponseEntity<?> selectYearStatistics(
			@RequestBody AccessInternetBankingStatistics data 
		){
		System.out.println("year : " + data.getYear());
		data = repo.findAccessInternetBankingStatisticsByYear(data.getYear());
		return ResponseEntity.ok(data);
	}
	
	/***
	 * 데이터 파일(서울시 인터넷뱅킹 이용률 및 이용기기 통계 데이터)에서 각 레코드를 데이터베이스에 저장
	 */
	@Transactional
	@PutMapping("/insert")
	public ResponseEntity<?> insertStatistics(
			@RequestBody AccessInternetBankingStatistics data 
	){
		Optional<AccessInternetBankingStatistics> dataCheck = repo.findByYear(data.getYear());
		if(dataCheck.isEmpty()) {
			repo.save(data);
			return ResponseEntity.ok(data);
		}else {
			return null;
		}
		
	}
}
