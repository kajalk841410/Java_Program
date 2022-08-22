 /*Take integer n as input and print the following pattern.
    1
   121
  12121
 1212121
121212121
    */
 import java.io.*;
import java.util.*;
public class Myclass
{
	public static void main (String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt();
	   for(int i=0;i<n;i++)
	   int k=1,p=i;
	    {
	        for(int j=0;j<n;j++)
	        {
	            if(j>=n-i&& j<=n-2+i)
	             System.out.print("*"); 
	           else
	           System.out.print(" ");
	           }
	        
	        System.out.println();
	    }
	 }
 }
