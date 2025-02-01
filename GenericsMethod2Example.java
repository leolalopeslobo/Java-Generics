public class GenericsMethod2Example {
    
    // Generic method that accepts any type of argument and prints it
    public static <T> void printGeneric(T value) {
        System.out.println("Value: " + value);
    }

    // Generic method that returns two given parameters as a concatenated string
    public static <T, U> String concatenate(T first, U second) {
        return first.toString() + " " + second.toString();
    }

    public static void main(String[] args) {
        // Calling generic method with different data types
        printGeneric(10);          // Integer
        printGeneric("Hello");    // String
        printGeneric(3.14);       // Double
        printGeneric(true);       // Boolean

        // Calling the concatenate method
        System.out.println(concatenate("Hello", 100));  // Output: Hello 100
        System.out.println(concatenate(42, 3.14));       // Output: 42 3.14
        System.out.println(concatenate(true, "World")); // Output: true World
    }
}
