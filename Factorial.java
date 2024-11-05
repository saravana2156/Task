public class Factorial {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

        // Initialize the factorial result variable
        long factorial = 1;

        // Check if the number is negative, as factorial is not defined for negative numbers
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate the factorial using a loop
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply the current number with the result
            }
            // Output the result
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
