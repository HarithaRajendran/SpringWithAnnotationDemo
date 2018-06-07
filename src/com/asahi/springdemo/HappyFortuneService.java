package com.asahi.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		return "Your Day is Good...";
	}

}
