package ru.openclade.fourth;

public interface Builder {
	public void reset();
	public String getType();
	public String getEngine();
	public void setEngine(String str);
	public void setSeats(int seats);
}
