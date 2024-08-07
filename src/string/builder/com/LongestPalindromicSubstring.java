/*
 * 1. longest palindromic substring
 
   Input: "babad"
   Output: "bab"
 */

package string.builder.com;

import java.util.Scanner;

public class LongestPalindromicSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stringBuffer : ");
		StringBuilder sb1 = new StringBuilder(sc.next());
		StringBuilder sb3=null;
		int lenth=0;
		for(int i=0;i<sb1.length()+1;i++) {
			for(int j=i+1;j<sb1.length()+1;j++) {
			String str=sb1.substring(i, j);
			StringBuilder temp=new StringBuilder(str);
			StringBuilder sb2 = new StringBuilder(str);
			sb2=sb2.reverse();
            if(temp.compareTo(sb2)==0) {
               if(temp.length()>lenth) {
               	sb3=temp;
               	lenth=temp.length();
               }
            }
			}
		}
		System.out.println("Logest palidrome:"+sb3);
	}

}