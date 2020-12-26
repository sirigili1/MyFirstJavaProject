package springdemo;

public class MyApp {

	public static void main(String[] args) {
		//Coach coachID=new BaseBall();
		
		Coach coachID=new TrackCoach();
		
		System.out.println(coachID.getCoachDetails());

	}

}