package question1;

import java.util.Scanner;

public class Question1 {

    public static String toHex(int decimal) {
        int rem;
        String hexadecimal = "";
        char hexchars[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (decimal >= 0) {
            rem = decimal % 16;
            hexadecimal = hexchars[rem] + hexadecimal;
            decimal = decimal / 16;
        }
        return hexadecimal;
    }

    public static int toBinary(int decimal) {

        int binary = 0;
        int remainder, i;
        for (i = 1; decimal != 0; i = i * 10) {
            remainder = decimal % 2;
            decimal /= 2;
            binary += remainder * i;

        }

        return binary;
    }

    public static void main(String[] args) {

        System.out.println("How many numbers would you like to convert from decimal to its binary and hexadecimal equivalents?");
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        

        
        while(c>0){
        System.out.println("Enter the decimal number you wish to :");
        int decimalNumber = scanner.nextInt();
        System.out.println("Decimal\t\tBinary\t\tHexadecimal");
        System.out.println(decimalNumber + "\t" + "\t" + Integer.toBinaryString(decimalNumber) + "\t" + "\t" + Integer.toHexString(decimalNumber));
        c--;
        }
    }
}
