package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		//inversion of control learning - handle creating and mannaging objects
		// by using either xml, annotation or java source code
//		Coach theCoach = new BaseballCoach();
		Coach theCoach = new TrackCoach();
		System.out.println(theCoach.getDaillyWorkOut());
	}

}
