// Main.java (Test the Animal Classes)
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Whiskers");

        myDog.makeSound();  // Buddy says: Woof!
        myCat.makeSound();  // Whiskers says: Meow!

        myDog.eat();        // Buddy is eating...
        myCat.eat();        // Whiskers is eating...
    }
}
