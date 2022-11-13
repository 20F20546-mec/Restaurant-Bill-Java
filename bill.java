import java.util.*;

public class bill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input the bill amount: ");
        Double bill_price = sc.nextDouble();

        System.out.println("Amount: " + bill_price);

        if(bill_price > 50) {
            bill_price = bill_price - (bill_price * 0.05);
        }

        System.out.println("Amount after discount: " + bill_price);
    }
}