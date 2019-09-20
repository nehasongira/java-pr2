import java.util.*;


class user  
{  
   
    private String fname;
    private String lname;
    private int age;
    private int salary;

    public  void assign(String fname,String lname,int age,int salary)
    {
      this.fname=fname;
      this.lname=lname;
      this.age=age;
      ValidAge(age);
      this.salary=salary;
    }
    public void ValidAge(int age)
    {
        if(age>16 && age<80)
        System.out.println("Age is between 16 and 80");
        else
        System.out.println("Age is not between 16 and 80");

    }
    public void fullname()
    {
        System.out.println("the full name is"+this.fname+" "+this.lname);
    }
  
   public static void main(String args[])  
   {  
      String fname,lname;
      int age,salary;
      System.out.println("enter the first name");
      Scanner inputScanner = new Scanner(System.in);     
      fname = inputScanner.nextLine(); 

      System.out.println("enter the last name");
      lname = inputScanner.nextLine(); 
      
      do
      { 
        System.out.println("enter the age name between 1-100");
        age = inputScanner.nextInt(); 
      }while(age<0 && age>100);
     
      System.out.println("enter the salary name");     
      salary = inputScanner.nextInt();
      user u=new user();
      u.assign(fname, lname, age, salary);
      //u.ValidAge(age);
      u.fullname();
   }  

}