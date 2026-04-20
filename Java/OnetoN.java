import java.util.Scanner;

public class OnetoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("N= ");
        int n = sc.nextInt();
        System.out.println("--------------");
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}
