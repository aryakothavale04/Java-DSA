
import java.util.*;

public class prime{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code goes here
        System.out.print("Enter a number to check if it is prime or not : ");
        int n = sc.nextInt();

       
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime == true) {
                System.out.println("Prime number");
            } else {
                System.out.println("Not a prime number");
            }
        
    }
}
