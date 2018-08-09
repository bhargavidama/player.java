/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n, c, fact = 1;
      Scanner in = new Scanner(System.in);
 
      n = in.nextInt();
 
      if (n < 0)
         System.out.println("Number should be non-negative.");
      else
      {
         for (c = 1; c <= n; c++)
            fact = fact*c;
 
         System.out.println(fact);
	}
}
}
