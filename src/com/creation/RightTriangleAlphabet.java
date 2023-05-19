package com.creation;

public class RightTriangleAlphabet {
	public static void main(String[] args) {
		int letter=65;
		int i,j,n=5;
		for( i=0;i<=n;i++) {
			for(j=0;j<=i;j++) {
				System.out.print((char)(letter+j) +" ");
			}
			System.out.println();
		}
	}
}
