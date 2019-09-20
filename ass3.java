import java.util.*;

  
   class Member
   {
       private name;
       private age;
       private  salary;

       Member(String name,int age,int salary)
       { 
         this.name=name;
         this.age=age;
         this.salary=salary;
         
       }
       public void display()
       {
           System.out.println("name"+this.name);
           System.out.println("Age"+this.age);
           System.out.println("Salary"+this.salary);
       }
   }
 class MemberVariable{
      
    public static void main(String args[])  
   {  
      
      System.out.println("enter");
      Member m=new Member("sally",22,50000);
      m.display();
   }  


 }
   