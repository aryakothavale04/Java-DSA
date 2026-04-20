
import java.util.Scanner;

public class breakKeywoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code goes here
        System.out.println("Do Not Enter Multipel of 10 !");
        System.out.println("------------------------------");
        int num;
        do { 
            System.out.print("Enter a number : ");
            num = sc.nextInt();
            if ( num%10 ==0) {
                break;
            }
        } while (true);
        System.out.println("Are yar ! you lost !");
    }
}
