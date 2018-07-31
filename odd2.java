/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int m,n,i;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		int l=0;
		for(i=m+1;i<n;i++){
			
			if((i%2!=0)){
				
				if(l<1)
				{
				System.out.print(i);
				}
				else
				{
				System.out.print(" ");
		                 	System.out.print(i);
		             	}
				l++;
				
			}
		}
	}
}
