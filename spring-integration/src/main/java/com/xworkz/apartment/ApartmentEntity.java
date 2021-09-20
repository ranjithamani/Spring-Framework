package com.xworkz.apartment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "apartment_table")
public class ApartmentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "a_id")
	private int id;
	@Column(name = "a_name")

	private String name;
	@Column(name = "a_noOfFloors")

	private int noOfFloors;
	@Column(name = "a_flatPrice")

	private double flatPrice;
	@Column(name = "a_parking")

	private boolean parking;

	public ApartmentEntity() {

	}

	public ApartmentEntity(int id, String name, int noOfFloors, double flatPrice, boolean parking) {
		super();
		this.id = id;
		this.name = name;
		this.noOfFloors = noOfFloors;
		this.flatPrice = flatPrice;
		this.parking = parking;
	}

	@Override
	public String toString() {
		return "ApartmentEntity [id=" + id + ", name=" + name + ", noOfFloors=" + noOfFloors + ", flatPrice="
				+ flatPrice + ", parking=" + parking + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noOfFloors;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApartmentEntity other = (ApartmentEntity) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noOfFloors != other.noOfFloors)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public double getFlatPrice() {
		return flatPrice;
	}

	public void setFlatPrice(double flatPrice) {
		this.flatPrice = flatPrice;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

}
