public class Perfectnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        int sum=0;
        
        for ( int i=1;i<=number/2;i++){
            if(number%1==0) {
                sum += i;
            }
        }
        if(sum==number) {
            System.System.out.println(number + "is a perfect number");

        } else{
            System.out.println(number+"is not a perfect number");
        }
        scanner.close();
    }
    
}
