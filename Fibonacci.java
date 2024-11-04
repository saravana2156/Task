public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int firstterm = 0, Secondterm = 1;
        System.err.println("Fibonacci series upto" + n + "terms:");
        for (int i = 1; i<=n; i++) {
            System.out.println(firstterm +" ");
            int nextterm = firstterm + Secondterm;
            firstterm = Secondterm;
            Secondterm = nextterm;
        }
    }
    
}
