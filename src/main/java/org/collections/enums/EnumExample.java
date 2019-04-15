package org.collections.enums;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.collections.object.Car;

public class EnumExample {

	public static void main(String[] args) {
		//EnumSet
		EnumSet<WeekDay> holyDays = EnumSet.of(WeekDay.SUNDAY);
		holyDays.add(WeekDay.SATURDAY);
		for (WeekDay weekDay : holyDays) {
			System.out.println(weekDay.getRu());
		}
		
		//EnumMap
		List<Car> minivansCars = new ArrayList<Car>();
		minivansCars.add(new Car("TOYOTA"));
		minivansCars.add(new Car("BMV"));

		List<Car> sportCars = new ArrayList<Car>();
		sportCars.add(new Car("LEXUS"));
		sportCars.add(new Car("AUDI"));

		EnumMap<CarType, List<Car>> enumMap = new EnumMap<>(CarType.class);
		enumMap.put(CarType.SPORT, sportCars);
		enumMap.put(CarType.CROSSOVER, minivansCars);
		
		iterateMap(enumMap);

	}
	public static void iterateMap(Map map) {
		System.out.println();
		Iterator<Map.Entry<CarType, Car>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<CarType, Car> carEntry = iterator.next();
			System.out.println(carEntry.getValue() + " " + carEntry.getKey());
		}
	}
}