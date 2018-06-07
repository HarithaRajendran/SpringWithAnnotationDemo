/*package com.asahi.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.asahi.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfigClass {
	
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach(FortuneService fortuneService) {
		return new SwimCoach(sadFortuneService());
	}
	
	
}
*/