package org.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.collections.comparator.CarYearComparator;
import org.collections.object.Car;
import org.collections.object.CarYear;

public class SetExample {

	public static void main(String[] args) {
		hashSetExample();
		linkedHashSetExample();
		treeSetExample();
	}

	// not ordered
	public static void hashSetExample() {

		Set<Car> cars = new HashSet<Car>();
		Car car1 = new Car("BMV");
		Car car2 = new Car("NIVA");
		Car car3 = new Car("NISSAN");
		Car car4 = new Car("NISSAN");

		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);

		Iterator<Car> it = cars.iterator();

		System.out.println();
		System.out.println("HashSet Example");
		while (it.hasNext()) {
			System.out.println(it.next().getName());
		}
	}

	// ordered
	public static void linkedHashSetExample() {

		Set <Car> cars = new LinkedHashSet<Car>();
		Car car1 = new Car("BMV");
		Car car2 = new Car("NIVA");
		Car car3 = new Car("NISSAN");
		Car car4 = new Car("NISSAN");

		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);

		Iterator<Car> it = cars.iterator();
		
		System.out.println();
		System.out.println("LinkedHashSet Example");
		while (it.hasNext()) {
			System.out.println((it.next()).getName());
		}
	}

	// sorted
	public static void treeSetExample() {

		Set <CarYear> cars = new TreeSet<CarYear>(new CarYearComparator());
		
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
		
		Iterator<CarYear> it = cars.iterator();
		
		System.out.println();
		System.out.println("TreeSet Example");
		while (it.hasNext()) {
			CarYear carYear = it.next();
			System.out.println(carYear.getName()+" "+carYear.getYear());
		}
	}
}