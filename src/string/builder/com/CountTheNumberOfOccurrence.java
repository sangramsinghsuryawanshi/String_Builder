/*
 * 
 * 3. Write a Java program that accepts a string as input and counts the 
 * number of occurrences of each character using the StringBuffer class.
 */

package string.builder.com;

import java.util.Scanner;

public class CountTheNumberOfOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stringBuffer 1 : ");
		StringBuffer s = new StringBuffer(sc.nextLine());
		String s1=s.toString();
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int c=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					c++;
					ch[j]='\0';
				}
			}
			if(ch[i]!=' ' && ch[i]!='\0')
			System.out.println(ch[i]+" count "+c);
		}
	}

}
