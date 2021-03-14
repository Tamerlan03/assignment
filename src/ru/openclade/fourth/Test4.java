package ru.openclade.fourth;

public class Test4 {
	public static void main(String[] args) {
		Director director = new Director();
		Car car = new Car();
		director.makeEngine(car);
		Plane plane = new Plane();
		director.makeEngine(plane);
		System.out.println(car.getEngine());
		System.out.println(plane.getEngine());
	}
}
