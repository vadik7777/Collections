package org.collections.queue;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

import org.collections.object.Car;

public class QueueExample {

	public static void main(String[] args) {

		// Очередь с ограничениями на количество элементов
		Queue<Car> arrayBlockingQueue = new ArrayBlockingQueue<Car>(5);

		Car car1 = new Car("BMV");
		Car car2 = new Car("NIVA");
		Car car3 = new Car("NISSAN");
		Car car4 = new Car("KIA");
		Car car5 = new Car("LEXUS");
		Car car6 = new Car("TOYOTA");
		Car car7 = new Car("SUZUKI");

		arrayBlockingQueue.add(car1);
		arrayBlockingQueue.add(car2);
		arrayBlockingQueue.add(car3);
		arrayBlockingQueue.add(car4);
		arrayBlockingQueue.add(car5);

		// Ошибка при добавлении Queue full
		// arrayBlockingQueue.add(car6);

		System.out.println("elements arrayBlockingQueue");
		// Получение Head
		System.out.println("Head " + arrayBlockingQueue.peek());
		// Елементы очереди
		print(arrayBlockingQueue);

		// Удаление head из очереди
		System.out.println("Remove head " + arrayBlockingQueue.poll());

		// Добавление элемента в очередь
		arrayBlockingQueue.add(car6);
		System.out.println("Add " + car6);
		// Получение Head
		System.out.println("Head after add" + arrayBlockingQueue.peek());
		// Елементы очереди
		print(arrayBlockingQueue);
		System.out.println();

		System.out.println("elements ArrayDeque");
		// Двунаправленная очередь без ограничений
		Deque<Car> arrayDeque = new ArrayDeque<Car>(arrayBlockingQueue);

		// Получение Head
		System.out.println("Head " + arrayDeque.peekFirst());
		// Получение End
		System.out.println("End " + arrayDeque.peekLast());
		// Елементы очереди
		print(arrayDeque);

		// Удаление head из очереди
		System.out.println("Remove head " + arrayDeque.poll());

		// Добавление в двунаправленную очередь
		arrayDeque.add(car7);
		System.out.println("Add " + car7);
		// Получение Head
		System.out.println("Head " + arrayDeque.peekFirst());
		// Получение End
		System.out.println("End " + arrayDeque.peekLast());
		// Елементы очереди
		print(arrayDeque);
		System.out.println();

		System.out.println("elements LifoQueue");
		// Преобразование двустронней очереди в одностороннюю типа LIFO
		Queue<Car> lifoQueue = Collections.asLifoQueue(arrayDeque);

		// Получение Head
		System.out.println("Head " + lifoQueue.peek());
		// Елементы очереди
		print(lifoQueue);
		// Удаление head из очереди
		System.out.println("Remove head " + arrayDeque.poll());
		// Добавление элемента в head
		lifoQueue.add(new Car("SUZUKI1"));
		System.out.println("Head after add" + lifoQueue.peek());
		print(lifoQueue);
		System.out.println();

		Stack<Car> stack = new Stack<Car>();
		stack.add(car1); // BMV
		stack.add(car2);
		stack.add(car3);
		stack.add(car4);
		stack.add(car5);
		stack.add(car6); // TOYOTA

		System.out.println("elements stack");
		print(stack);
		// Получение Head
		System.out.println("Head " + stack.peek());
		// Удаление head из очереди
		System.out.println("Remove head " + stack.pop());
		print(stack);
		System.out.println("First element in collection "+stack.get(0));
		System.out.println("Last (Head) element in collection "+stack.get(stack.size()-1));
	}

	public static void print(Collection<Car> collection) {
		Iterator<Car> iterator = collection.iterator();
		while (iterator.hasNext()) {
			Car car = iterator.next();
			System.out.println(car.getName());
		}
	}
}
