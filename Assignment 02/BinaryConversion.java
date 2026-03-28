import java.util.Arrays;
import java.util.Scanner;
 
public class BinaryConversion{

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Integer Number: ");
        int num = inp.nextInt();

    //Part (a) Write Java program that takes input an integer number and converts it into a  binary number  
        String binary = "";
         if(num == 0)binary = "0";
         int temp = num;
         while(temp > 0){
            int reminder = temp % 2;
            binary = reminder + binary;
            temp = temp / 2;
         }
         System.out.println("Part(a) Binary Number: " + binary);

         int[] arrResult = toBinaryArrays(num);
         System.out.println("Part(b) Arrays: " + Arrays.toString(arrResult));

         String strResult = toBinaryString(num);
         System.out.println("Part(c) String: " + strResult);
        }

        /*Part (b) Write user defined Java functions to carry out calculation as 
        mentioned in Part (a). This function should take an integer number as parameter, 
        calculates its binary representation, stores it in an integer array and returns that
        array of integers (that contains its binary digits) as return value*/
         public static int[] toBinaryArrays (int n){
            if (n == 0) return new int[]{0};

            int temp = n;
            int size = 0;
            while (temp > 0) { 
                temp = temp / 2;
                size++;
            }

            int[] BinaryArray = new int[size];
            for(int i = size-1; i >= 0; i--){
                BinaryArray[i] = n%2;
                n = n / 2; 
            } 
            return BinaryArray;
        }

         /*Part (c) Write user defined Java functions to carry out calculation as 
          mentioned in Part (a). This function should take an integer number as parameter, 
          calculates its binary representation, stores these bits in a string and returns that 
          string (that has its binary digit representation) as return value*/
        public static String toBinaryString (int n){
            if (n == 0)return "0";

            String binary = "";
            while (n > 0) { 
                int reminder = n % 2;
                binary = reminder + binary;
                n = n / 2;
            }  
            return binary;
        }
}