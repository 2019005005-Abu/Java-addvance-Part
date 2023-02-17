interface Animal{
    int eye=2;
    public void walk();
}

interface Herbivore{
  
}

 class Horse implements Animal,Herbivore{
        public void walk(){
            System.out.println("Walk on 4 walks");
        }
 }
 class Interface{
    public static void main(String args[]){
        Horse horse =new Horse();
        horse.walk();
    }
}