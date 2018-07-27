/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	char ch;
	Scanner s=new Scanner(System.in);
	ch=s.next().charAt(0);
	if(ch>=65&&ch<=122)
	{
	if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
	{
		System.out.println("Vowel");
	}
	else
	{
		System.out.println("Constant");
	}
	}
	else if(ch>=48&&ch<=57)
	{
		System.out.println("Digit");
	}
	else
	{
		System.out.println("Invalid");
	}
	}
	}
