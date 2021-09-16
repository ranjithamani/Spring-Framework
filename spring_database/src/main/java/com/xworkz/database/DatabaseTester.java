package com.xworkz.database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DatabaseTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String beanConfigurationPath = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(beanConfigurationPath);

		Database database = context.getBean(Database.class);
		System.out.println(database);
	}

}
