package com.xworkz.developer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeveloperTester {

	public static void main(String[] args) {
		String beanConfigurationPath = "applicationContext.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(beanConfigurationPath);
		Developer developer=(Developer)container.getBean("developer");
		System.out.println(developer);
		
		String s1 = container.getBean(String.class);
		System.out.println("String:"+s1);
		
		 Integer i1=container.getBean(Integer.class);
		 System.out.println("Integer:"+i1);
		
		 Double d1=container.getBean(Double.class);
		 System.out.println("Double:"+d1);
		 
		 Float f1=container.getBean(Float.class);
		 System.out.println("Float:"+f1);
		 
		 Long l1=container.getBean(Long.class);
		 System.out.println("Long:"+l1);
		 
		 Boolean b1=container.getBean(Boolean.class);
		 System.out.println("Boolean:"+b1);
		 
		 Short sh1=container.getBean(Short.class);
		 System.out.println("Short:"+sh1);
	}

}
