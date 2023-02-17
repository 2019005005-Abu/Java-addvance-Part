  abstract class Animal{
   abstract void walk();
   Animal(){
    System.out.println("You are creating a new Animal");
   }
   public void eat(){
     System.out.println("Animals eats");
   }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Created a Horse");
    }
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}
public class Abstraction {
   public static void main(String args[]){
     Horse horse=new Horse();
     horse.walk();
     Animal animal=new Animal();
     animal.wait();
     horse.eat();
   }
}
