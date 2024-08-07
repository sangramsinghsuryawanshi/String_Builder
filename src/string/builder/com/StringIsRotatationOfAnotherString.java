/*
 * 5. Write a Java method to check if a given string is a rotation of another string, using only one call to the substring method.

   Input: "abcd", "cdab"
   Output: true
 */

package string.builder.com;

import java.util.Scanner;

public class StringIsRotatationOfAnotherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stringBuffer 1 : ");
		String sb1 = new String(sc.next());
		System.out.println("Enter stringBuffer 2 : ");
		String sb2 = new String(sc.next());
		sb1=sb1+sb1;
		if(sb1.contains(sb2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}

}
