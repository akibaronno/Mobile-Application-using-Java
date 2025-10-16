// Animal.java (Abstract Class)
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }

    // Abstract method
    public abstract void makeSound();

    // Concrete method
    public void eat() {
        System.out.println(name + " is eating...");
    }
}
