package com.asahi.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach{
	
	@Autowired
	@Qualifier("sadFortuneService")
	private FortuneService fortuneService;
	
	//----------------------------------------
	
	/*@Autowired
	TennisCoach(@Qualifier("happyFortuneService")FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	*/
	//----------------------------------------
	
	/*@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		return "Do Some workout...";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}
	
	

}
