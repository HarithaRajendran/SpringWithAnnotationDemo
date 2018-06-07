/*package com.asahi.springdemo;


import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	@Value("${email}")
	private String email;
	
	@Value("${team}")
	private String team;
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim Atleast 1000 meter for warm up...";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
*/