package ua.lviv.lgs;

import java.util.Random;

public class Application {
	public static void main(String[] args) {
		System.out.println("����� �� ����� ��������");
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
				"MAX/MIN VALUE = �� ����������� ������� ��� ����� true �� false, ���� ���� � ����� �� ����� ������ �������� 1 �� 0 ���� ������������ �� � int . ");
		// � ���� 37 ������ ���������� �� 37 �� 38 ���� ������������?
		System.out.println();
		System.out.println("����� ��������");
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
		System.out.println("̳������� �������� " + min);
		System.out.println("����������� �������� " + max);
	//	System.out.println();
	//	for (int i = 0; i < ar.length; i++) {
	//		System.out.println("������ ������ " + i + " = " + ar[i]); }
		//first commit to github

	}
}
