package string.builder.com;

import java.util.Scanner;

public class StringBuilderMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter string 1: ");
	     StringBuilder stb = new StringBuilder(sc.nextLine());
	     System.out.println("String Builder: "+stb);
	     stb.append('s');
	     System.out.println("Append Method: "+stb);
	     System.out.println("Capacity: "+stb.capacity());
	     System.out.println("Index of: "+stb.charAt(0));
	     System.out.println("Insert string: "+stb.insert(4, "is simple"));
	     stb.setCharAt(1, 'c');
	     System.out.println("charSet :"+stb);
	     System.out.println("LastIndexOf: "+stb.lastIndexOf("simple"));
	}

}
