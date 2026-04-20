import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("N= ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("--------------");
        while(i<=n){
            sum = sum + i ;
            i++;
        }
        System.out.println("Sum = "+sum);
    }
}
