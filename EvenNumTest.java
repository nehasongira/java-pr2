import java.util.*;
class EvenNumTest  
{  
   
    public static boolean isEven(int num)
    {
      int n=num;
      if(n%2==0)
      return true;
      else
      return false; 
    }
   public static void main(String args[])  
   {  
      boolean result=false;
      System.out.println("enter the number to check for even");
      Scanner inputScanner=new Scanner(System.in);
      int num=inputScanner.nextInt();
      result=isEven(num);
      if(result==true)
      System.out.println("true");
      else
      System.out.println("false");
    }  

}