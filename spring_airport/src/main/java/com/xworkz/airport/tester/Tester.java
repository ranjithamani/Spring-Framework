package com.xworkz.airport.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.airport.Airport;

public class Tester {

	public static void main(String[] args) {
		String beanConfigurationFile = "spring.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(beanConfigurationFile);
		Airport airport = container.getBean(Airport.class);
		System.out.println(airport);
		airport.runway();
		airport.maintainance();
	}

}
