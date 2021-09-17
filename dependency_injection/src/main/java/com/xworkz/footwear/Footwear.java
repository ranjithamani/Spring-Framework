package com.xworkz.footwear;

public class Footwear {
	public String brand;
	public String color;
	public double price;
	public Material material;
	
	@Override
	public String toString() {
		return "Footwear [brand=" + brand + ", color=" + color + ", price=" + price + ", material=" + material + "]";
	}

	public Footwear(String brand, String color, double price, Material material) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.material = material;
	}
	
	public void walk() {
		System.out.println("invoked walk");
		material.protection();
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	
}
