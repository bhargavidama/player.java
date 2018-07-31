/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int N;
		int a[],max;
		a=new int[20];
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		
		for(int i=0;i<N;i++)
		{
			a[i]=sc.nextInt();
		}
		max=a[0];
		for(int i=0; i<N;i++)
		{
			if(max<a[i])
			max=a[i];
		}
		System.out.println(max);
		}
		}
