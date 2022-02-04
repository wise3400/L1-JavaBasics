/* *****************************************************************************
 *              ALL STUDENTS COMPLETE THESE SECTIONS
 * Title:            Lab 1: Java Basics
 * Files:            JavaBasics.java
 * Semester:         Spring 2022
 * 
 * Author:           Wilson Seet | wilson.seet@colorado.edu
 * 
 * Description:		 This program contains the first Lab Assignment on Java Basics
 * 
 * Written:       	 1/14/2022
 * 
 * Credits:          https://www.learnjavaonline.org/en/Conditionals
 **************************************************************************** */


/**
 * This class contains the first Lab Assignment on Java Basics
 *
 *
 * @author Wilson Seet
 */

public class JavaBasics {

	public static void main(String[] args) 
	{
		
		// 1. Find and add the method to print the String "Hello World!" below this comment
			System.out.println("Hello World!");
		
		// 2. Below this comment, define variables with all the basic primitives (except long and double), and instantiate them with different values. Concatenate them into a string and print it to the console so it will output the following: "H3110 w0r1d 2.0 true"
			char letterH = 'H';
			char letterW = 'w';
			char letterR = 'r'; 
			char letterL = 'l'; 
			char letterD = 'd'; 
			int numOne = 3;
			int numTwo = 1;
			int numThree = 1; 
			int numFour = 0;
			int zero = 0;
			float point = 2.0f;
			boolean t = true;
			System.out.println("" + letterH + numOne + numTwo + numThree + numFour + " " + letterW + zero + letterR + letterL + letterD + " " + point + " " + t);
		
		// 3. Change the values of the 4 String variables in the code below, so it reaches the method to print "Success!" to the console
		
		String a = "ATLAS";
		String b = a;
		String c = b + "!";
		String d = c;

		boolean b1 = a == b;
		boolean b2 = d.equals(b + "!");
		boolean b3 = !c.equals(a);

		if (b1 && b2 && b3) {
			System.out.println("Success!");
		}
		
	}
}
