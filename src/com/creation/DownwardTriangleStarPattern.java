package com.creation;

public class DownwardTriangleStarPattern {
	public static void main(String[] args) {
		int i, j, row =6;
		for(i=row-1;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
