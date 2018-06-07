/*package com.asahi.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimConfigClassDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfigClass.class);

		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmail()+"--->"+theCoach.getTeam()	);
		
		
		context.close();

	}

}*/
