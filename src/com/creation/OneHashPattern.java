package com.creation;

import java.util.Scanner;

public class OneHashPattern {
	
	public static void main(String[] args) {
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			for (j = 1; j <=i ; j++) {
				if(i%2!=0) {
					if(j==i)
					System.out.print(j);
					else {
						System.out.print(j+" # ");
					}
				}
			}
			for(j=i;j>=1;j--) {
				if(i%2==0) {
					if(j==1)
						System.out.print(j);
					else
					System.out.print(j+" # ");
				}
			}
			System.out.println();
		}
	}
}
