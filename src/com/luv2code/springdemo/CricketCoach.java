package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//new fields
	private String emailAddress;
	private String team;
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside the setter method = setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside the setter method = setTeam");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("CricketCoach: inside the no-arg constructor");
	}	
	
	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside the setter method = setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "practice fast bowling for 15 min a day";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
