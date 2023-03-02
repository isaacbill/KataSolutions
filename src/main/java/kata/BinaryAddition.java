package kata;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryAddition {
	public static void main( String[] args) { 
	     int m,n,add; 
	     BinaryAddition ba=new BinaryAddition(); 
	     System.out.println("enter the value of m and n"); 
	     m=sc.nextInt(); 
	     n=sc.nextInt(); 
	     add=m+n; 
	     ba.fun(add); 
	   }
	static Scanner sc=new Scanner(System.in); 
	   public void fun(int n1) {
	      int i=0; 
	      int sum[]=new int[20]; 
	      while(n1>0) { 
	        sum[i]=n1%2; n1=n1/2; i++; 
	      } 
	      for(int a=i-1;a>=0;a--) { 
	          System.out.print(sum[a]); 
	      }  
	   } 
	   
}
