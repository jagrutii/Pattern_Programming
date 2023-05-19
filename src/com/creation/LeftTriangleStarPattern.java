package com.creation;

  
  public class LeftTriangleStarPattern { 
	  public static void main(String[] args)
  { 
		  int i, j, row=6;
		  for(i=1;i<row;i++)
		     { 
			  for(j=1;j<=row-i;j++) {
				  System.out.print(" ");
			  }
//			  for (j=2*(row-i); j>=0; j--)         
//			  {  
//			  //prints space between two stars      
//			  System.out.print(" ");   
//			  }   
			  for(j=1;j<=i;j++) { 
				System.out.print("*"); 
			 }
			 System.out.println();
			 } 
		  } 
	  }
 
  

