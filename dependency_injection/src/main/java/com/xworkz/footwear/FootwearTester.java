package com.xworkz.footwear;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FootwearTester {

	public static void main(String[] args) {
		String beanConfigurationFile = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(beanConfigurationFile);
		
		Footwear footwear = context.getBean(Footwear.class);
		System.out.println(footwear.brand);		
		System.out.println(footwear.color);
		System.out.println(footwear.price);

		System.out.println(footwear.material.cloth);
		System.out.println(footwear.material.lather);
		System.out.println(footwear.material.rubber);
		 footwear.walk();


	}

}
