class Pen{
    String color;
    String type;//bolpoint;
    public  void write() {
        System.out.println("Writing something");
    }
    public void printColor() {
      System.out.println(this.color);
    }
    
}

class Student{
  String name;
  int age;

  public void PrintName() {
    System.out.println(this.name);
    System.out.println(this.age);
  }

}

class Student1{
  String firstName;
  String lastName;
  Student1(String firstName,String lastName){
    this.firstName=firstName;
    this.lastName=lastName;
  }
  Student1(Student1 s2){
    this.firstName=s2.firstName;
    this.lastName=s2.lastName;
  }
  Student1(){

  }
  public void myfullName() {
    System.out.println("First Name"+this.firstName);
    System.out.println("Last Name"+this.lastName);
  }
}

public class Object_OrientedPart_1 { 
  public static void main(String[] args) {
    Pen pen1=new Pen();
    Student s1=new Student();
    pen1.color="blue";
    pen1.type="gel";
    pen1.write();

    Pen pen2=new Pen();
    pen2.color="black";
    pen2.type="baalpoint";
    pen1.printColor();
    pen2.printColor();
    s1.name="Abu Al Shahriar Rifat";
    s1.age=24;
    s1.PrintName(); 

    Student1 ss1=new Student1("Abu Al","Shahriar");

    Student1 ss3=new Student1();
    ss3.firstName="Abu Al Shahriar";
    ss3.lastName="Rifat";
    Student1 ss2=new Student1(ss3);
    ss3.myfullName();

}

}