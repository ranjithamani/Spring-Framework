package com.xworkz.refrigerator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Stabilizer {
	@Value("V-Guard")
	private String brand;
	@Value("6000")
	private double price;

	public Stabilizer() {
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName() + "bean created");

	}

	public Stabilizer(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Stabilizer [brand=" + brand + ", price=" + price + "]";
	}
	

}
