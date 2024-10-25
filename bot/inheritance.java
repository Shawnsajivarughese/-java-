// Animal class: This is the base (parent) class.
class Animal {
    
    // Method to print that the animal can eat
    public void eat() {
        System.out.println("I can eat");
    }

    // Method to print that the animal can sleep
    public void sleep() {
        System.out.println("I can sleep");
    }
}

// Dog class: This class inherits from the Animal class.
class Dog extends Animal {
    
    // Method specific to the Dog class to print that it can bark
    public void bark() {
        System.out.println("I can bark");
    }
}

// Main class: The entry point of the program.
public class Main {

    // The main method where the program starts execution
    public static void main(String[] args) {
        
        // Creating an object (instance) of the Dog class
        Dog dog1 = new Dog();

        // Calling the eat() method (inherited from Animal)
        dog1.eat();

        // Calling the sleep() method (inherited from Animal)
        dog1.sleep();

        // Calling the bark() method (specific to Dog)
        dog1.bark();
    }
}
