package com.statistics;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.statistics.domain.AccessInternetBankingStatistics;
import com.statistics.persistence.AccessInternetBankingStatisticsRepository;

@SpringBootTest
public class StatisticsApplicationInsertTests {

	@Autowired
	AccessInternetBankingStatisticsRepository repo;
	
	@Test
	void testInsertData() {
		AccessInternetBankingStatistics data = new AccessInternetBankingStatistics();
//		data.setYear(2018);
		data.setYear(2019);
		data.setUseratio(40.2);
		data.setSmartphone(30.2);
		data.setDesktop(16.4);
		data.setNotebook(34.2);
		data.setEtc(33.3);
		data.setSmartpad(12.1);
		repo.save(data);
		
	}
	
}
