/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	    public static void main(String[] args)
    {
int inputNumber;
Scanner sc=new Scanner(System.in);
inputNumber=sc.nextInt();
    {
        //Creating a copy of input number
 
        int copyOfInputNumber = inputNumber;
 
        //Initializing sum to 0
 
        int sum = 0;
 
        while (copyOfInputNumber != 0)
        {
            //Getting last digit of the input number
 
            int lastDigit = copyOfInputNumber%10;
 
            //Adding last digit to sum
 
            sum = sum + lastDigit;
 
            //Removing last digit from the input number
 
            copyOfInputNumber = copyOfInputNumber/10;
        }
 
        //Printing sum
 
        System.out.println(sum);
    }
}
}
