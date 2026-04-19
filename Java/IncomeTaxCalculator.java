import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount : ");
        double amount = sc.nextDouble();
        double tax;

        if (amount <= 500000){
            tax = 0;
        }else if (500000<amount && amount <=1000000){
            tax = (20.0/100)*amount;
        }else{
            tax=(30.0/100)*amount;
        }
        System.out.println(tax);
    }
}
