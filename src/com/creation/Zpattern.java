package com.creation;

public class Zpattern {
	public static void main(String[] args) {
		int i,j,n=5;
		int k=n-1,num1=1,num2=1;
		for(i=0;i<n;i++) {
			System.out.print(num1++ +" ");
				}
		System.out.println();
		for(i=1;i<n-1;i++) {
			for(j=0;j<2*(n-i-1);j++) {
				System.out.print(" ");
			}
				System.out.print(k-- +"  ");		
				System.out.println();
		}
		for(i=0;i<n;i++) {
			System.out.print(num2++ +" ");
		}
		System.out.println();
	}
}
