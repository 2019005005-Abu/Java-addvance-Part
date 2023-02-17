import java.util.*;
import Bank;

class Shape{
  public void area(){
    System.out.println("displays-area");
  }
}

class Triangle extends Shape{
   public void areas(int l,int h) {
    System.out.println(1/2*l*h);
   }
} 

class EqillateTrangle extends Triangle{
   public void area(int l,int h) {
    System.out.println(1/2*l*h);
   }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println((3.1416)*r*r);
    }
}

 class Inheritance{
     public static void main(String[] args) {
        Bank.Account account1=new Bank.Account();
        account1.name="customer_1";
        
     }
}
