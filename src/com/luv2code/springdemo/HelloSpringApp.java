package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		//constructor (the bean name, the interface name to implement)
		//using just constructor (the bean name) implies you may not
		//get ClassCastException at run time while trying to cast the bean
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theCoachTwo = context.getBean("mySecondCoach", Coach.class);
		//call methods on the bean
		System.out.println(theCoach.getDaillyWorkOut());
		
		System.out.println(theCoachTwo.getDaillyWorkOut());
		
		
		//close the context
		context.close();
	}

}
