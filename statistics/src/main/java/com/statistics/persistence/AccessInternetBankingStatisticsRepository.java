package com.statistics.persistence;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.statistics.domain.AccessInternetBankingStatistics;

public interface AccessInternetBankingStatisticsRepository extends CrudRepository<AccessInternetBankingStatistics, Integer>{

	AccessInternetBankingStatistics findAccessInternetBankingStatisticsByYear(int year);
	
	Optional<AccessInternetBankingStatistics> findByYear(int year);

}
