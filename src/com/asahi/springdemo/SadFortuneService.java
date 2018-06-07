package com.asahi.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		return "Today is ur Sad Day...";
	}

}
