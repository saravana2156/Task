public class primenumber {
    public static void main(String[] args) {
        Scanner scanner = new scanner(system.in);
        System.out.println("Enter a number:");
        int number= scanner.nextInt();
        if (is prime number) {
            System.out.println(number + "is a prime numeber");

        } else {
            System.out.println(number+"is not a prime number"); 

        }
        scanner.closes();
    }
    public static boolean isprime(int n) {
        if (n<=1) {
            return false;
        }
        for (int i=2; i<=Maths.sqrt(n);i++) {
            if (n%1 == 0) {
                return flase;
            }
        }
        return true;
    }
}