package pac1;

import java.util.Scanner;

public class Lab1_5 {
    public static void main(String[] args) {
        Scanner userInt = new Scanner(System.in);
        
        System.out.print("Enter a number please: ");
        int num = userInt.nextInt();

        if(num >= 0) System.out.println("Your number is positive.");
        else System.out.println("Your number is negative.");
    }
}