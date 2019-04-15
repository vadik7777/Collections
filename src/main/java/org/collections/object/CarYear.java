package org.collections.object;

public class CarYear extends Car {

	private int year;

	public CarYear(String name, int year) {
		super(name);
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}