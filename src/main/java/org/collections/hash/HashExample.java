package org.collections.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import org.collections.object.Car;

public class HashExample {
	public static void main(String[] args) {

		HashMap<String, Car> hashMap = new HashMap<>();
		hashMap.put("test", new Car("TOYOTA"));
		hashMap.put("bmv", new Car("BMV"));
		hashMap.put("niva", new Car("NIVA"));
		hashMap.put("lexus", new Car("LEXUS"));
		hashMap.put("test", new Car("AUDI"));
		iterateMap(hashMap);

		TreeMap<String, Car> treeMap = new TreeMap<>();
		treeMap.put("test", new Car("TOYOTA"));
		treeMap.put("bmv", new Car("BMV"));
		treeMap.put("niva", new Car("NIVA"));
		treeMap.put("lexus", new Car("LEXUS"));
		treeMap.put("test", new Car("AUDI"));
		iterateMap(treeMap);

		LinkedHashMap<String, Car> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("test", new Car("TOYOTA"));
		linkedHashMap.put("bmv", new Car("BMV"));
		linkedHashMap.put("niva", new Car("NIVA"));
		linkedHashMap.put("lexus", new Car("LEXUS"));
		linkedHashMap.put("test", new Car("AUDI"));
		iterateMap(linkedHashMap);

		System.out.println("Lower " + treeMap.lowerKey("niva"));
		System.out.println("Higher " + treeMap.higherKey("niva"));

	}

	public static void iterateMap(Map<String, Car> map) {
		System.out.println();
		Iterator<Map.Entry<String, Car>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Car> carEntry = iterator.next();
			System.out.println(carEntry.getValue() + " " + carEntry.getKey());
		}
	}
}
