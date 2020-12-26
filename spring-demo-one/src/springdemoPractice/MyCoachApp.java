package springdemoPractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyCoachApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("springdemoPractice.xml");
		Coach myCoach=context.getBean("myCoachID",Coach.class);
		System.out.println(myCoach.getCoachDetails());
		context.close();
	}

}
