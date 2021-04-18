package com.statistics;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.statistics.domain.AccessInternetBankingStatistics;
import com.statistics.persistence.AccessInternetBankingStatisticsRepository;

@SpringBootTest
class StatisticsApplicationTests {

	@Autowired
	AccessInternetBankingStatisticsRepository repo;
	
	@Test
	void testSelectData() {
		
		repo.findAll().forEach(
				select -> System.out.println(select)
		);
		
	}

}
