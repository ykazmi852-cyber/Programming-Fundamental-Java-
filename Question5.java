import java.util.Scanner;

public class Question5
 {
    public static void main(String[] args)
     {
        Scanner read = new Scanner(System.in);
       
        System.out.println("Enter voltage in volts");
        double voltage = read.nextDouble();
       
        System.out.println("Enter current in ampere");
        double current = read.nextDouble();
       
        double watt = voltage * current;
       
        System.out.println("Power: " + watt + " Watts");
    }
}