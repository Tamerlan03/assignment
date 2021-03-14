package ru.openclade.fourth;

public class Plane implements Builder {
	private Plane plane;
	private String engine;
	private int seats;
	@Override
	public void reset() {
		this.plane = new Plane();
	}

	@Override
	public String getType() {
		return "plane";
	}

	@Override
	public String getEngine() {
		return engine;
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
