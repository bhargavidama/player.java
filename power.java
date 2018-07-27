/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
         int num, power;
         Scanner sc=new Scanner(System.in);
         num=sc.nextInt();
         power=sc.nextInt();

        long result = 1;

        while (power != 0)
        {
            result *= num;
            --power;
        }

        System.out.println( result);
	}
}
