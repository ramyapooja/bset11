/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=sc.nextInt();
		int initial = str.length()-n;
		for(int i=initial; i<str.length(); i++) 
		{
		  if(i<str.length()-1)
		  System.out.print(str.charAt(i)+" ");
		  else
		  System.out.print(str.charAt(i));
		}
	}
}
