package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("BeanLifeCycle-springdemoConfigFile.XML");
		
		
		// load the bean from spring container
		
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		// call method with bean
		
		System.out.println(theCoach.getCoachDetails());
		
		//close the context
		context.close();

	}

}
