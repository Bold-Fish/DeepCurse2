package BVDT;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		//
		
		Random r = new Random(); //random-class variable
		//nextInt(upperbound) generates random numbers in the range 0 to upperbound-1.
		//nextFloat() generates a float between 0.0 and 1.0.
		//nextDouble() generates a double between 0.0 and 1.0.
		
		//------------------------------------------------------------------------
		System.out.println("please input a x1 value below...");
		
		String input1 = scan.nextLine();
		String value1 = input1.replaceAll("[^0-9]", ""); //replaces all instances of these characters with a null-space?
		
		
		System.out.println("r gets next random integer: " + r.nextInt(10));
		System.out.println("input1: " + input1);
		System.out.println("value2: " + value1);
		
		//int lengthA = Integer.parseInt(input1);
		//System.out.println("lengthA returns the parsed form (primitive data-type) of your input: " + lengthA);
		
		
		
		
		/*
		System.out.println("waiting for input");
		int length = Integer.parseInt(scan.nextLine().replaceAll("[^0-9]", ""))-1;
		
		String[] cha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
				"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "`", "~", "1", "!", "2", "@", "3", "#", "4",
				"$", "5", "%", "6", "^", "7", "&", "8", "*", "9", "(", "0", ")", "-", "_", "=", "+", "[", "{", "]", "}",
				"\\", "|", ";", ":", "'", "\"", ",", "<", ".", ">", "/", "?" };

		Random r = new Random();

		for (int i = 0; i <= length; i++) {

			System.out.print(cha[r.nextInt(93)]);

		}
		*/
	}

}
