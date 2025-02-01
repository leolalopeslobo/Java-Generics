/*
 * This is a Java program demonstrating the use of Generics in a method.
 * A generic method allows us to create a method that can work with different data types.
 */

public class GenericsMethod1Example {
    
    // Generic method that accepts any type of argument and prints it
    public static <T> void printGeneric(T value) {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        // Calling generic method with different data types
        printGeneric(10);          // Integer
        printGeneric("Hello");    // String
        printGeneric(3.14);       // Double
        printGeneric(true);       // Boolean
    }
}
