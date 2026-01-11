import java.util.Scanner;

public class Question7 
{
    public static void main(String[] args)
     {
        Scanner read = new Scanner(System.in);
       /*We use int bcz we're dealing with 
       whole numbers (integers) like 1,2,3,etc.*/
        System.out.println("Enter an integer number");
        int num = read.nextInt();
        
        if (num % 2 == 0)
      
        System.out.println("Even"); 
        else // if the remainder is not 0
        System.out.println("Odd");   
    }
}
