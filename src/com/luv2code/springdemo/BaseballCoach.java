package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	@Override
	public String getDaillyWorkOut() {
		return "Spend 30 Minutes on batting practice.";
	}
}
