import java.util.*;

import javax.print.DocFlavor.STRING;   
class ass1  
{  
   
    public static void palindrome(String str1)
    {
       String original=str1,reverse="";
       int length = original.length();
       for (int i = length - 1; i >= 0; i--)
       { reverse = reverse + original.charAt(i);}
       System.out.println(reverse);
        if (original.equals(reverse))
         System.out.println("The string is a palindrome.");
        else
         System.out.println("The string isn't a palindrome.");
    }
   public static void main(String args[])  
   {  
      String str;
      System.out.println("enter the number/string for palindrome checking");
      Scanner inputScanner = new Scanner(System.in);     
      str = inputScanner.nextLine(); 
      ass1.palindrome(str);
   }  

}