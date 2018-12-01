package com.lvsh.demo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String email;
	
	private String name;
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
