import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        Human<String , String> johnsPassword = new Human("Hello1231" , "k@i.ua");

        System.out.println(johnsPassword.getPassword());
        System.out.println(johnsPassword.getEmail());
        Dog john = new Dog("John" , 23 , true , true);
        System.out.println(john);
        john.bark();


//        Random random = new Random();
//
//        int secretNumber = random.nextInt(100) + 1;
//
//        int attempts = 0;
//
//        boolean hasGuessed = false;
//
//        while(!hasGuessed){
//            System.out.println("Welcome to the Guess the number game! Enter number in the range from 1 to 100");
//            // scanner -  input
//            String userChoice = scanner.next();
//            int userChoiceNum = Integer.parseInt(userChoice);
//            // ++ - shot-hand quote
//
//            if(userChoiceNum == secretNumber) {
//                hasGuessed = true;
//                System.out.println(userChoice);
//                System.out.println(secretNumber);
//                System.out.println("Good sh*t , you've done it! You had " + attempts + " attermpts" );
//            }else if (userChoiceNum != secretNumber) {
//                System.out.println("Bad sh*t , you didn't guess!");
//                System.out.println(userChoice);
//                System.out.println(secretNumber);
//                attempts++;
//            }else {
//                System.out.println("Get out of here");
//                System.out.println(userChoice);
//                System.out.println(secretNumber);
//                attempts++;
//            }
//
//        }


//        scanner.close();

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


        // Cycle
//        int i = 0 ;
//        i++;
//        i++;
//        i++;
//        i++;
//        i++;
//        i++;
//        i++;
//        i++;
//        i++;
//        i++;

//        for (int i = 0 ; i <= 10 ;i++) {
//            System.out.println(i);
//        }


//    int i = 0;
//
//    while (i <= 10) {
//        System.out.println(i);
//        i++;
//
//    }
//        boolean isRunning = true;
//        int i = 0 ;
//
//
//        while (isRunning) {
//            System.out.println("Hi , mate ? How's it going ? What's your name ? ");
//            String name = scanner.next();
//            String expectedName = "John";
//
//            if(name.equals(expectedName)) {
//                isRunning = false;
//            }
//
//            System.out.println(i);
//            i++;
//
//        }

//        for(int i = 0 ; i < 10 ; i++){
//
//            if(i % 2 == 0) continue;
//
//            if(i == 7) break;
//
//            System.out.println(i);
//
//        }
//
//        String str = "Hello , World!";
//
//        String helloFromStr = str.substring(0, 5);
//        System.out.println(helloFromStr);
//        System.out.println(str);

//        int strLength = str.length();
//
//        System.out.println(str.length());
//
//        for(int i = 0 ; i <= strLength - 1 ; i++){
//            System.out.println(str.charAt(i));
//        }
//        System.out.println(str.charAt(0));
//        System.out.println(str.charAt(1));
//        System.out.println(str.charAt(2));
//        System.out.println(str.charAt(3));

//        try {
//            int[] myNumbers = {1, 2, 3};
//            System.out.println(myNumbers[2]);
//        }catch (Exception e) {
//            System.out.println(e);
//            System.out.println("There were errors");
//        }finally  {
//            System.out.println("WE should be here in any cases");
//        }
//
//
//        System.out.println("Hello");

        // Initialize Input
//        Scanner scanner = new Scanner(System.in);

        // Here we declared str arr and then put there words which will be met in the future in the program
//        String [] words = {
//                "John",
//                "Java",
//                "Hello",
//        };

        // Here we exressed how would work our random pick of word
//        String chosenWord = words[
                //int - to lead str to number
//                (int) (Math.random() * words.length)

                //Math.random() - method which gives us random double(type) number , range is between 0 and 1
//                ];

        // Array defined for char
//        char[] guessedSymbols = new char[chosenWord.length()];

        // Char - data type which characterized as 1 symbol
//        for(int i = 0 ; i < guessedSymbols.length ;i++) {
//            guessedSymbols[i] = '_';
//        }
//
//        int attempts = 4;

//        System.out.println("Welcome to the game , here you might try guess the word.");
//
//        while(attempts > 0 && new String(guessedSymbols).contains("_")) {
//            System.out.println("Your word is : " + String.valueOf(guessedSymbols));
//            System.out.println("Attempts to guess : " + attempts);
//            System.out.println("Enter ur char : ");
//
//            char userAttempt = scanner.next().charAt(0);
//
//            if(chosenWord.contains(String.valueOf(userAttempt))) {
//                for(int i = 0 ; i < chosenWord.length(); i++) {
//                    if(chosenWord.charAt(i) == userAttempt) {
//                        guessedSymbols[i] = userAttempt;
//                    }
//                }
//            } else {
//                System.out.println("Something went wrong , try again later");
//                attempts-- ;
//            }
//        }

//        if(attempts == 0) {
//            System.out.println("You've lost ur attempts , go to sleep. " + chosenWord);
//        } else {
//            System.out.println("You've won , good job");
//        }
//
//        scanner.close();
//        String model = scanner.next();

//        Car myCar2 = new Car("Audi" , "darkmagenta" , 2313, 4);

    }
}