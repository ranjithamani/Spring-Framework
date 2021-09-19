package com.xworkz.refrigerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Refrigerator {
	@Value("LG")
	private String brand;
	@Value("Black")
	private String color;
	@Value("60000")
	private double price;
	@Autowired
	private Stabilizer stabilizer;

	public Refrigerator() {
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass().getSimpleName() + "bean created");
	}

	public Refrigerator(String brand, String color, double price, Stabilizer stabilizer) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.stabilizer = stabilizer;
	}

	@Override
	public String toString() {
		return "Refrigerator [brand=" + brand + ", color=" + color + ", price=" + price + ", stabilizer=" + stabilizer
				+ "]";
	}

	

}
