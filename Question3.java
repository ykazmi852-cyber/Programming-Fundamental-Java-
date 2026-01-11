import java.util.Scanner;

public class Question3{

    public static void main (String[]args){
          Scanner read = new Scanner(System.in);
         
          System.out.println("Original selling price");
          double original_price = read.nextDouble();

          System.out.println("Enter discounted percentage");
          double discount_percentage = read.nextDouble();
         
          double discount_amount = (original_price * discount_percentage)/100;
          double discountedprice = original_price - discount_amount;

         System.out.println("Discount selling price:" + discountedprice);
    }
}
