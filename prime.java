/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num,b,c;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		b=1;
		c=0;
		while(b<=num)
		{
			if((num%b)==0)
			c=c+1;
			b++;
		}
		if(c==2)
		{
		System.out.println("Yes");
	}
		else
		{
		System.out.println("No");
	}
	}
}
