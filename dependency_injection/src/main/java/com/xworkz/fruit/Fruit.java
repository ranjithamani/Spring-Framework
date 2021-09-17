package com.xworkz.fruit;

public class Fruit {
	public String name;
	public String color;
	public double price;
	public boolean taste;
	public Vitamin vitamin;

	public void provideEnergy() {
		System.out.println("invoked provideEnergy");
		vitamin.growth();
	}

	public Fruit(String name, String color, double price, boolean taste, Vitamin vitamin) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.taste = taste;
		this.vitamin = vitamin;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", price=" + price + ", taste=" + taste + ", vitamin="
				+ vitamin + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isTaste() {
		return taste;
	}

	public void setTaste(boolean taste) {
		this.taste = taste;
	}

	public Vitamin getVitamin() {
		return vitamin;
	}

	public void setVitamin(Vitamin vitamin) {
		this.vitamin = vitamin;
	}

}
