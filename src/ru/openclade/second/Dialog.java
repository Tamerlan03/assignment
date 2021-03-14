package ru.openclade.second;

public abstract class Dialog {
	abstract String createString();
	
	
	public String generateString() {
		String str = createString() + " Hello";
		return str;
	}

}
