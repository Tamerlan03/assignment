package ru.openclade.third;

public class Dialog implements GUIDialog {
	String str;
	
	public Dialog getDialog() {
		return this;
	}
	@Override
	public void setType(String str) {
		this.str = str;
		
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.str;
	}

	 
}
