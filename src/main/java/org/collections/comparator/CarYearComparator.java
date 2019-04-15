package org.collections.comparator;

import java.util.Comparator;

import org.collections.object.CarYear;

public class CarYearComparator implements Comparator<CarYear>{

	@Override
	public int compare(CarYear o1, CarYear o2) {
		Integer car1 = o1.getYear();
		Integer car2 = o2.getYear();
		return car1.compareTo(car2);
	}
}