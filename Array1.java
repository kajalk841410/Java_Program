/*package whatever //do not write package name here */
// create an array of 5 floats and calculate their sum.

import java.io.*;

public class Myclass {
	public static void main (String[] args) {
	    float []Mark = {45.7f,67.8f,63.4f,99.2f,100.0f};
	    float sum = 0;
	    for (float element:Mark){
	        sum =sum+element;
	    }
	      System.out.println("the value is sum is"+sum);
	      
}
}
