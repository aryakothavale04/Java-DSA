
import java.util.Scanner;

public class reverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code goes here
        System.out.println("Enter a number to reverse : ");
        int n = sc.nextInt();
        int rev = 0 ;
        System.out.println("----------------");
        while(n > 0){
            int lastDigit= n % 10;
            rev = (rev*10)+lastDigit;
            n = n/10;
        }
        System.out.println(rev);
    }
}
