/*
 * Q16. Odd Even Problem
 Given a string S of lowercase english characters, find out whether the summation of X and Y is
 even or odd, where X is the count of characters which occupy even positions in english
alphabets and have positive even frequency, and Y is the count of characters which occupy odd
 positions in english alphabets and have positive odd frequency.
 Note: Positive means greater than zero.
 Example 1:
 Input: S = "abbbcc"
 Output: "ODD"
 Explanation: X = 0 and Y = 1 so (X + Y) is
 ODD. 'a' occupies 1st place(odd) in english
 alphabets and its frequency is odd(1), 'b'
 occupies 2nd place(even) but its frequency
 is odd(3) so it doesn't get counted and 'c'
 occupies 3rd place(odd) but its frequency
 is even(2) so it also doesn't get counted.
 Example 2:
 Input: S = "nobitaa"
 Output: "EVEN"
 Explanation: X = 0 and Y = 2 so (X + Y) is
 EVEN.
 */


package string.builder.com;

import java.util.Scanner;

public class EvenOddOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string 1 : ");
		StringBuilder s = new StringBuilder(sc.nextLine());
		int x=0,y=0;
		for(int i=0;i<s.length();i++) {
			int c=1;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					c++;
					s.deleteCharAt(j);
					j--;
				}
			}
			if(s.charAt(i)%2==0 && c%2==0) {
				x++;
			}
			if(s.charAt(i)%2!=0 && c%2!=0) {
				y++;
			}
		}
		if((x+y)%2==0) {
			System.out.println("Given StringBuilder is Even");
		}else {
			System.out.println("Given StringBuilder is ODD");
		}
	}

}
