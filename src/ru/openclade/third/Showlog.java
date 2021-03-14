package ru.openclade.third;

public class Showlog implements GUIDialog {

	private String str;
	public Showlog getShowlog() {
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
