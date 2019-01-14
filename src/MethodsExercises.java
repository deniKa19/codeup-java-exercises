import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");


        System.out.println(addNumbers(2, 8));
        System.out.println(subtractNumbers(8, 2));
        System.out.println(multiplyNumbers(2, 8));
        System.out.println(divideNumbers(8, 4));

        //System.out.println("Enter a number between 1 and 10: ");
        //String userNumber = scanner.next();
        //System.out.println(getInteger(1, 10));
        int x = getInteger(1, 10);
        System.out.println(x);

        userFactorial(scanner);

        rollDiceGame(scanner);
    }


    public static int addNumbers(int number, int num) {
        return number + num;
    }

    public static int subtractNumbers(int number, int num) {
        return number - num;
    }

    public static int multiplyNumbers(int number, int num) {
        return number * num;
    }
    //MULITPLY WITHOUT USING *

    public static long multiply(int number, int num) {
        if (number == 0 || num == 0) {
            return 0;
        }
        long product = 0;
        if (num > 1) {
            do {
                product += number;
                num--;
            } while (num >= 1);
        } else {
            do {
                product -= number;
                num++;
            } while (num <= -1);
        }
        return product;
    }

    public static double divideNumbers(double number, double num) {
        return number / num;
    }

    public static int remainder(int number, int num) {
        return number % num;
    }


    public static int getInteger() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        return scanner.nextInt();
    }

    public static int getInteger(int min, int max) {
        System.out.println("Enter an integer from " + min + " and " + max);
        int userNumber = getInteger();
        if (userNumber < min || userNumber > max) {
            System.out.println("please try again");
            userNumber = getInteger(min, max);
        }
        return userNumber;
    }

    public static long calculateFactorial(int num) {
        int output = 1;
        for (int i = 1; i <= num; i += 1) {
            output *= i;
        }
        return output;
    }

    public static void userFactorial(Scanner scanner) {
        boolean willContinue;
        String userChoice;
        do {
            System.out.println("Enter an integer from 1 to 10");
            int userNumber = getInteger(1, 10);
            System.out.println(calculateFactorial(userNumber));
            do {
                System.out.println("Do you wish to continue? [y/n]:");
                userChoice = scanner.next().trim();
            } while (!userChoice.equalsIgnoreCase("y") && !userChoice.equalsIgnoreCase("n"));
            willContinue = userChoice.equalsIgnoreCase("y");
        } while (willContinue);
    }

    public static int randomRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }

    public static void rollDiceGame(Scanner scanner) {
        String userChoice;
        System.out.println("Enter a number of sides for the dice:");
        int numberSides = getInteger(1, 10);
        do {
            System.out.print("You rolled a " + randomRange(1, numberSides) + " and a " + randomRange(1, numberSides));
            do {
                System.out.println(" Would you like to roll again? [y/n]: ");
                userChoice = scanner.next().trim();
            } while (userChoice.equalsIgnoreCase("y") && userChoice.equalsIgnoreCase("n"));
        } while (!userChoice.equals("n"));

    }

}




