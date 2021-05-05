package ua.lviv.lgs;

import java.util.Random;

public class Application {
	public static void main(String[] args) {
		System.out.println("Перше та друге завдання");
		System.out.println();
		byte a0 = 1;
		short a1 = 2;
		int a2 = 3;
		long a3 = 4L;
		float a4 = 5F;
		double a5 = 6;
		char a6 = 'a';
		boolean a7 = true;
		System.out.print("Byte = " + a0 + "; ");
		System.out.print("MAX VALUE = " + Byte.MAX_VALUE + "; ");
		System.out.println(" MIN VALUE = " + Byte.MIN_VALUE + ".");
		System.out.print("Short = " + a1 + "; ");
		System.out.print("MAX VALUE = " + Short.MAX_VALUE + "; ");
		System.out.println("MIN VALUE = " + Short.MIN_VALUE + ".");
		System.out.print("Integer = " + a2 + "; ");
		System.out.print("MAX VALUE = " + Integer.MAX_VALUE + "; ");
		System.out.println("MIN VALUE = " + Integer.MIN_VALUE + ".");
		System.out.print("Long = " + a3 + "; ");
		System.out.print("MAX VALUE = " + Long.MAX_VALUE + "; ");
		System.out.println("MIN VALUE = " + Long.MIN_VALUE + ".");
		System.out.print("Float = " + a4 + "; ");
		System.out.print("MAX VALUE = " + Float.MAX_VALUE + "; ");
		System.out.println("MIN VALUE = " + Float.MIN_VALUE + ".");
		System.out.print("Double = " + a5 + "; ");
		System.out.print("MAX VALUE = " + Double.MAX_VALUE + "; ");
		System.out.println("MIN VALUE = " + Double.MIN_VALUE + ".");
		System.out.print("Char = " + a6 + "; ");
		System.out.print("MAX VALUE = " + Character.MAX_VALUE + "; ");
		System.out.println("MIN VALUE = " + Character.MIN_VALUE + ".");
		System.out.print("Boolean = " + a7 + "; ");
		System.out.println(
				"MAX/MIN VALUE = це філософське питання хто більше true чи false, хоча вони і мають під собою цифрові значення 1 та 0 якщо конвертувати їх в int . ");
		// А чому 37 строка робивається на 37 та 38 після форматування?
		System.out.println();
		System.out.println("Трете завдання");
		System.out.println();
		int[] ar = new int[10];
		int max = 0;
		int min = 10;
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 10);
			if (ar[i] > max) {
				max = ar[i];
			} else if (ar[i] < min) {
				min = ar[i];
			}
		}
		System.out.println("Мінімальне значення " + min);
		System.out.println("Максимальне значення " + max);
	//	System.out.println();
	//	for (int i = 0; i < ar.length; i++) {
	//		System.out.println("Комірка масиву " + i + " = " + ar[i]); }
		//first commit to github

	}
}
