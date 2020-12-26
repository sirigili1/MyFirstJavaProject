package springdemo;

public class CricketCoach implements Coach {

	private FortuneInterface fortuneinterface;
	
	//add new fields for emailAdress and team
	
	private String emailAddress;
	private String team;
		
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no-arg constructor");
	}
	
	//setter method
	public void setFortuneinterface(FortuneInterface fortuneinterface) {
		System.out.println("CricketCoach: Inside setter method for Fortune Service");
		this.fortuneinterface = fortuneinterface;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside setter method for set email Address");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside setter method to set team");
		this.team = team;
	}

	@Override
	public String getCoachDetails() {
		
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneinterface.getFortune();
	}

}
