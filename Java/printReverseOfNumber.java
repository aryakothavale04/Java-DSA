
import java.util.Scanner;

public class printReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code goes here
        System.out.println("Enter a number to reverse : ");
        int n = sc.nextInt();
        System.out.println("----------------");
        while(n > 0){
            int lastDigit= n % 10;
            n = n/10;
            System.out.print(lastDigit);
        }
    }
}
