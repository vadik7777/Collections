package org.collections.compare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.collections.comparator.CarNameComparator;
import org.collections.comparator.CarYearComparator;
import org.collections.object.Car;
import org.collections.object.CarYear;

public class CompareExample {

	private static ArrayList<CarYear> cars = new ArrayList<CarYear>();
	
	public static void main(String[] args) {
		
		CarYear car1 = new CarYear("BMV", 2010);
		CarYear car2 = new CarYear("NIVA", 2004);
		CarYear car3 = new CarYear("NISSAN", 2003);
		CarYear car4 = new CarYear("OPEL", 2002);
		CarYear car5 = new CarYear("NISSAN", 2005);
		
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		
		Comparator<Car> carNameComparator = new CarNameComparator();
		Comparator<CarYear> carYearComparator = new CarYearComparator();
		
		System.out.println("List Ordered");
		print(cars);
		
		System.out.println("List sort by name");
		Collections.sort(cars, carNameComparator);
		print(cars);
		
		System.out.println("List sort by year");
		Collections.sort(cars, carYearComparator);
		print(cars);
		
		Set<CarYear> treeCars = new TreeSet<CarYear>(carNameComparator);
		treeCars.add(car1);
		treeCars.add(car2);
		treeCars.add(car3);
		treeCars.add(car4);
		
		System.out.println("TreeSet by year");
		print(treeCars);
		
	}
	public static void print(Collection <CarYear> collection) {
		Iterator<CarYear> iterator = collection.iterator();
		while(iterator.hasNext()) {
			CarYear car = iterator.next();
			System.out.println(car.getName()+" "+car.getYear());
		}
		System.out.println();
	}
}