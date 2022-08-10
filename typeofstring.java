//write a program to find out the type of website from the url

import java.util.*;
public class Myclass{
    public static void main(String [] args)
    {
   
    Scanner sc = new Scanner (System.in);
    String website = sc.next();
    if (website.endsWith(".org")) {
    System.out.println("this is an organizational website");
    }
    else if (website.endsWith(".com")) {
  System.out.println("this is commerical website"); 
  }
  else if (website.endsWith(".in")) {
  System.out.println("this is an indian website"); 
       }
       
     }
}
