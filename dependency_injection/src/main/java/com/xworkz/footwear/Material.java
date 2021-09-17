package com.xworkz.footwear;

public class Material {
	public String rubber;
	public String lather;
	public String cloth;

	public Material(String rubber, String lather, String cloth) {
		super();
		this.rubber = rubber;
		this.lather = lather;
		this.cloth = cloth;
	}
	public void protection() {
		System.out.println("invoked protection");
	}

	public void setRubber(String rubber) {
		this.rubber = rubber;
	}

	public void setLather(String lather) {
		this.lather = lather;
	}

	public void setCloth(String cloth) {
		this.cloth = cloth;
	}

}
