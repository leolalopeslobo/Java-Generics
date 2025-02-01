/*
 * This is a Java program demonstrating the use of Generics in a class.
 * Generics allow us to create a class that can work with different data types.
 */

// Define a generic class with a type parameter <T>
class GenericBox<T> {
    private T value; // A variable of type T

    // Constructor to initialize the value
    public GenericBox(T value) {
        this.value = value;
    }

    // Method to get the value
    public T getValue() {
        return value;
    }

    // Method to set a new value
    public void setValue(T value) {
        this.value = value;
    }

    // Method to display the value
    public void display() {
        System.out.println("Value: " + value);
    }
}

public class GenericsExample {
    public static void main(String[] args) {
        // Create a GenericBox instance for Integer type
        GenericBox<Integer> intBox = new GenericBox<>(100);
        intBox.display(); // Output: Value: 100

        // Create a GenericBox instance for String type
        GenericBox<String> strBox = new GenericBox<>("Hello, Generics!");
        strBox.display(); // Output: Value: Hello, Generics!

        // Change the value
        strBox.setValue("Updated String Value");
        strBox.display(); // Output: Value: Updated String Value
    }
}
