/*
 * Q13. Easy string
 Example 1:
Input: S = "aaABBb"
 Output: "3a3b"
 Explanation: As 'a' appears 3 times
 consecutively and 'b' also 3 times,
 and 'b' and 'B' considered as same.
 Example 2:
 Input: S = "aaacca"
 Output: "3a2c1a"
 Explanation: As 'a' appears 3 times
 consecutively and 'c' also 2 times,
 and then 'a' 1 time.
 */

package string.builder.com;

import java.util.Scanner;

public class CountCharAndAppendCountFrontOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stringBuffer 1 : ");
		StringBuffer s = new StringBuffer(sc.nextLine());
		String s1=s.toString();
		String s2=s1.toLowerCase();
		char ch[]=s2.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int c=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					c++;
					i++;
				}else {
					break;
				}
			}
			System.out.print(c+""+ch[i]);
		}
		
	}
}
