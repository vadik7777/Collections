package org.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import org.collections.object.Car;

public class ListExample {

	public static void main(String[] args) {
		arrayListExample();
		linkedListExample();
	}
	
	//ordered
	public static void arrayListExample() {
		ArrayList<Car> cars = new ArrayList<Car>();
		
		Car car1 = new Car("BMV");
		Car car2 = new Car("NIVA");
		Car car3 = new Car("NISSAN");
		Car car4 = new Car("NISSAN");
		
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(new Car("TOYOTA"));
		
		System.out.println("cars size "+cars.size());
		System.out.println("cars contains "+cars.contains(car2));
		System.out.println("cars indexOf "+cars.indexOf(car2));
		System.out.println("cars selected "+cars.get(1).getName());
		
		Iterator<Car> iterator = cars.iterator();
		
		System.out.println();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
		
		cars.clear();
		System.out.println("cars is empty "+cars.isEmpty());
	}
	public static void linkedListExample() {	
		LinkedList<Car> cars = new LinkedList<Car>();
		
		Car car1 = new Car("BMV");
		Car car2 = new Car("NIVA");
		Car car3 = new Car("NISSAN");
		Car car4 = new Car("NISSAN");
		
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(new Car("TOYOTA"));
		
		System.out.println("cars size "+cars.size());
		System.out.println("cars contains "+cars.contains(car2));
		System.out.println("cars indexOf "+cars.indexOf(car2));
		System.out.println("cars selected "+cars.get(1).getName());
		
		Iterator<Car> iterator = cars.iterator();
		
		System.out.println();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
		
		cars.clear();
		System.out.println("cars is empty "+cars.isEmpty());
	}
}
