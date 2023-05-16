//class TeslaFactory{
//   String name = "Tesla Truck";
//   int topSpeed = 120;
//   boolean CustomInterior;
//   boolean Ai;
//}

class Animals{
    int legs;
    boolean tail;
    String name;
    int age;

    // Creating a constructor
    public Animals(int numLeg, boolean tail, String animalName, int age){
        this.legs = numLeg;
        this.tail = tail;
        this.name = animalName;
        this.age = age;
    }
    void eat(){
        System.out.println(this.name +" is eating");
    }
}
public class ClassesAndObjects {
    public static void main(String[] args) {
       Animals Dog = new Animals(4, false, "Sheru", 10);
        Animals Dog1 = new Animals(4, false, "Shheru", 12);
        Animals Dog2 = new Animals(4, false, "Shhheru", 11);


       Dog1.eat();
       Dog.eat();
    }


}
