package com.xworkz.apartment.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.apartment.ApartmentEntity;
import com.xworkz.apartment.dao.ApartmentDAO;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ApartmentDAO dao = context.getBean(ApartmentDAO.class);
		ApartmentEntity entity = new ApartmentEntity();
		entity.setName("Vilas");
		entity.setNoOfFloors(30);
		entity.setFlatPrice(50000);
		entity.setParking(true);
		dao.save(entity);
	}

}
