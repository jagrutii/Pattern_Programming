package com.creation;

public class FloydsTriangle {
	public static void main(String[] args) {
		int i,j,n=5,temp=1;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(temp+" ");
				temp++;
			}
			System.out.println();
		}
	}
}
