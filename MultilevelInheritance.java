// Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class
class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks.");
    }
}

// Further derived class
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to test the multilevel inheritance
public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        // Calling methods from different levels of inheritance
        dog.eat();  // From Animal class
        dog.walk(); // From Mammal class
        dog.bark(); // From Dog class
    }
}
