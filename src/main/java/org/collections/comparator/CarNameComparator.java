package org.collections.comparator;

import java.util.Comparator;
import org.collections.object.Car;

public class CarNameComparator implements Comparator<Car> {

	@Override
	public int compare(Car car1, Car car2) {
		return car1.compareTo(car2);
	}

}
