package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("BeanScope-springdemoConfigFile.XML");
		
		
		// load the bean from spring container
		
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach=context.getBean("myCoach",Coach.class);
		
			
		boolean flag=(theCoach==alphaCoach);
		
		System.out.println("two object are same: "+ flag);
		System.out.println("object myCoach address: " + theCoach);
		System.out.println("object myCoach address: " + alphaCoach);
		
		//close the context
		context.close();

	}

}
