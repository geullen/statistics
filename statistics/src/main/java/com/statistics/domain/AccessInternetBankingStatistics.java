package com.statistics.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="accessinternetbankingstatistics")
public class AccessInternetBankingStatistics {

	@Id
	private int year;
	
	private double useratio;
	
	private double smartphone;
	
	private double desktop;
	
	private double notebook;
	
	private double smartpad;
	
	private double etc;
}
