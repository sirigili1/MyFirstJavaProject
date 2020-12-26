package springdemo;

public class BaseBallCoach implements Coach{

	//define a private field for the dependency
	private FortuneInterface fortuneservice;
	
	// define constructor for dependency injection
	public BaseBallCoach(FortuneInterface theFortuneService) {
		fortuneservice=theFortuneService;
	}
	
	@Override
	public String getCoachDetails() {
		return "Work for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneservice to get a fortune
		return fortuneservice.getFortune();
	}
	
}
