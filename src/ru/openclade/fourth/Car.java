package ru.openclade.fourth;

public class Car implements Builder {
	private Car car;
	private String engine;
	private int seats;
	@Override
	public void reset() {
		Car car = new Car();
	}

	@Override
	public String getType() {
		return "car";
	}

	@Override
	public String getEngine() {
		return this.engine;
	}

	@Override
	public void setEngine(String engine) {
		 this.engine = engine;
		
	}

	@Override
	public void setSeats(int seats) {
		this.seats = seats;
		
	}

}
