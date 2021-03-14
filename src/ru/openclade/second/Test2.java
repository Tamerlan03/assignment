package ru.openclade.second;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		Dialog dialog = null;
		if(str.equals("string")) {
			dialog = new StringDialog();
		} else if(str.equals("char")) {
			dialog = new CharDialog();
		}
		System.out.println(dialog.createString());
	}
}
