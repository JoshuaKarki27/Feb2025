package pac1;

import java.util.Scanner;
import java.util.HashSet;

public class Lab1_9 {
    public static void StringOperations(String s, int choice) {
        switch (choice) {
            case 1:
                System.out.println(s+s);
                break;
            
            case 2: {
                String newString = "";
                for (int i = 0; i < s.length(); i++) {
                    if (i % 2 != 0) {
                        newString += "#";
                    }
                    else newString += s.charAt(i);
                }
                System.out.println(newString);
                break;
            }
            case 3: {
                HashSet<Character> set = new HashSet<>();
                String newString = "";

                for (int i = 0; i < s.length(); i++) {
                    if (set.contains(s.charAt(i))) {
                        continue;
                    }
                    else {
                        newString += s.charAt(i);
                        set.add(s.charAt(i));        
                    }         
                }   
                System.out.println(newString);
                break;
            }

            case 4: {
                String newString = "";
                for (int i = 0; i < s.length(); i++) {
                    if (i % 2 != 0) {
                        newString += Character.toUpperCase(s.charAt(i));
                    }
                    else newString += s.charAt(i);
                }
                System.out.println(newString);
                break;
            }

            default: {
                System.out.println("Invalid choice.");
            }

        } 
    }

    public static void main(String[] args) {
        System.out.print("Input a string: ");

        Scanner userInput = new Scanner(System.in);
        String userString = userInput.nextLine();

        int userOption;

        do {
        System.out.println("Choose from the options below:\n1) Add String to itself\n2) Replace odd positions with #");
        System.out.println("3) Remove duplicate characters in the String\n4) Change odd characters to uppercase\n");
        System.out.println("Your selection: ");

        userOption = userInput.nextInt();        

        } while (userOption < 1 || userOption > 4);

        StringOperations(userString, userOption);
    }
}
