
import java.util.Scanner;

public class Boilerplate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code goes here
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.println("-----------------");

        for (int i = 0 ; i < n ; i++){
            for ( int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}
