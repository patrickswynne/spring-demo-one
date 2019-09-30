package com.luv2code.springdemo;

public class BaseballCoach  implements Coach {
	
	//define a private field
	private FortuneService fortuneService;
	//define a constructor
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 miutes in batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortune service to get a fortune
		
		return fortuneService.getFortune();
	}
}
