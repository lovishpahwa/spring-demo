package com.lvsh.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach coach =  context.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		

		System.out.println(coach.getDailyFortune());
		
		System.out.println(coach.getEmail());
		
		System.out.println(coach.getName());
		
		coach.print();
		
		context.close();

	}

}
