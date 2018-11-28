package com.lvsh.demo;

public class BaseBallCoach implements Coach {

	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "spend 20 min for batting"; 
	}
	
	public BaseBallCoach(FortuneService myFortuneService) {
		fortuneService = myFortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
