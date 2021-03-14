package ru.openclade.third;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		GUIDialog dialog = null;
		if(str.equals("dialog")) {
			dialog = new Dialog();
		} else if(str.equals("showlog")) {
			dialog = new Showlog();
		}
		
		dialog.setType("opentype");
		System.out.println(dialog.getType());
	}
}
