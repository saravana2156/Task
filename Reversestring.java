public class ReverseString {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a string
        System.out.print("Enter a string to reverse: ");
        String inputString = scanner.nextLine();

        // Reverse the string using StringBuilder
        String reversedString = new StringBuilder(inputString).reverse().toString();

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
