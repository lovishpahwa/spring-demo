package com.lvsh.demo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	public CricketCoach(){
		System.out.println("we are in cricket coach");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("we are inside cricketCoach for seting fortuneService proeprty");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "go and find the ball, LOL";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void print() {
		System.out.println("oops!!!!!!");
	}

}
