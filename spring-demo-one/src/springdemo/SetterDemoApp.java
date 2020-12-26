package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// load configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springdemoConfigFile.xml");
		
		// retrieve bean from spring container
		CricketCoach theCoach=context.getBean("mycricketcoach",CricketCoach.class);
		
		// call methods on the bean
		
		System.out.println(theCoach.getCoachDetails());
		
		System.out.println(theCoach.getDailyFortune());
		
		// call our new methods to get the literal values
		
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		
		// close the context
		context.close();
	}

}
