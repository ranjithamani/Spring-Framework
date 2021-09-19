package com.xworkz.refrigerator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefrigeratorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String beanConfiguration = "applicationContext1.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(beanConfiguration);
         
		Refrigerator refrigerator=context.getBean(Refrigerator.class);
		System.out.println(refrigerator);
	}

}
