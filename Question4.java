import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
       
        Scanner read = new Scanner(System.in);
       
        System.out.println("Enter discounted selling price");
        double discountedPrice = read.nextDouble();
       
        System.out.println("Enter discount percentage");
        double discountPercentage = read.nextDouble();
       
        double originalPrice = discountedPrice * 100 / (100 - discountPercentage);
        System.out.println("Original Price: " + originalPrice);
    }
}