import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;

        int attempts = 0;

        boolean hasGuessed = false;

        System.out.println("Welcome to the Guess the number game! Enter number in the range from 1 to 100");
        int userChoice = scanner.nextInt();
        // ++ - shot-hand quote
        attempts++;

        if(userChoice == secretNumber) {
            hasGuessed = true;
            System.out.println("Good sh*t , you've done it!");

        }else if (userChoice != secretNumber) {
            System.out.println("Bad sh*t , you didn't guess!");
            System.out.println(userChoice);
            System.out.println(secretNumber);
        }else {
            System.out.println("Get out of here");
            System.out.println(userChoice);
            System.out.println(secretNumber);
        }

        scanner.close();

        // Cycle

        // ctrl + / or cmd + /
        // Variables + dataTypes
//        int typeNumber = 13 ;
//        double floatData = 3.14;
//        String text = "Hello , Java";
//        boolean isDrunk = true;
//
//        System.out.println("<typeNumber> : " + typeNumber);
//        System.out.println("<floatData> : " + floatData);
//        System.out.println("<text> : " + text);
//        System.out.println("<isDrunk> : " + isDrunk);

        // What do we do with numbers ?
        // Operators arithmetic :
        // + , - , * , / , %

        // Comparison operators  , OUTPUT ALWAYS HAS BOOLEAN TYPE!:
        // == , != , > , < , >= , <=
//
//        System.out.println("Hello" == "Kirill");
//        System.out.println(2 != 2);
//        System.out.println(2 < 2);
//        System.out.println(2 > 2);
//        System.out.println(2 >= 2);
//        System.out.println(2 <= 2);

        // Logical operators  : || (or) && (and) !(not ...)
//        boolean isAdmin = true;
//        System.out.println(!isAdmin);
//
//        if(isAdmin == true) {
//            int x = 13;
//            System.out.println("Hello , mr. Admin");
//            System.out.println(x);
//        } else if (isAdmin == false) {
//            System.out.println("Hello , mr. Guest");
//        } else {
//            System.out.println("WTH?");
//        }


    }
}