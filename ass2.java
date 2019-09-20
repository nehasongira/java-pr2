import java.util.*;

import javax.print.DocFlavor.STRING;   
class ass2 
{  
   
    public static int power(int num)
    {    
        int n=num,flag=0;
        
        if(n == 0) 
        return 0; 
        while(n != 1) 
        {  
            if(n % 4 != 0) 
            return 0; 
            n = n / 4;      
        } 
        return 1; 
    }
   public static void main(String args[])  
   {  
      int num,num1;
      System.out.println("enter the number for checking power of 4");
      Scanner inputScanner = new Scanner(System.in);     
      num = inputScanner.nextInt(); 
      num1=ass2.power(num);
      if(num1==1)
      System.out.println("power of 4");
      else
      System.out.println(" not power of 4");
   }  

}
