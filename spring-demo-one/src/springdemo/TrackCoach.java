package springdemo;

public class TrackCoach implements Coach {

	private FortuneInterface myinterface;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneInterface myinterface) {
		
		this.myinterface = myinterface;
	}

	@Override
	public String getCoachDetails() {
		
		return "Run for 20 kms";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just Do it: " + myinterface.getFortune();
	}
	
	// add an init method... doesn't return
	
	public void doMyStartupStuff() {
		System.out.println("inside doMyStartupStuff method");
		//return "Test Startup";
		
	}
	
	// add a destroy method... doesn't return
	
	public void doCloseMyStuff() {
		System.out.println("inside doCloseMyStuff method");
		//return "Test Close";
	}
	

}
