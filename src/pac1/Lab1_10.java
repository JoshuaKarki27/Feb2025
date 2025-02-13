package pac1;

import java.util.Scanner;

public class Lab1_10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cont;

        do {
            System.out.print("Continue?\n1: Yes\n0: No\nYour Input: ");
            cont = in.nextInt();
            in.nextLine(); // Consume the leftover newline

            if (cont == 0) {
                break;
            }

            System.out.print("Input your String: ");
            String inputString = in.nextLine();
            boolean isNegative = false; // Reset for each new string

            for (int i = 0; i < inputString.length() - 1; i++) {
                if (inputString.charAt(i) > inputString.charAt(i + 1)) {
                    System.out.println("This string is negative\n----------------------------------");
                    isNegative = true;
                    break; // Exit loop early if negative
                }
            }

            if (!isNegative) {
                System.out.println("This string is positive\n----------------------------------");
            }

        } while (cont != 0);
    }

}