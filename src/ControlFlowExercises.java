import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //LOOP BASICS EXERCISE
        int i = 5;
        while (i <= 15) {
            System.out.println(i + " ");
            i++;
        }
        //DO WHILE LOOP COUNTS BY 2's STARTING WITH 0 AND ENDING IN 100
        //    int x = 0;
        //    System.out.println(x);
        //    do {
        //        x += 2;
        //        System.out.println(x);
        //    }while(x < 100);
        //        x++;

        //DO WHILE LOOP COUNTING BACKWARDS BY 5's FROM 100 TO -10
        //    int x = 100;
        //    System.out.println(x);
        //    do {
        //        x -= 5;
        //        System.out.println(x);
        //    }while(x > -10);
        //        x++;

        //DO WHILE LOOP SQUARED
        //    long y = 2;
        //    System.out.println(y);
        //    do {
        //        y *= y;
        //        System.out.println(y);
        //    }while(y < 1000000);
        //        y++;

        for (int x = 100; x > -10; x -= 5) {
            System.out.println(x);
        }


        for (long y = 2; y < 1000000; y *= y) {
            System.out.println(y);
        }

        //FIZZBUZZ EXERCISE
        for (int n = 1; n <= 100; n++) {
            if (n % 3 == 0) {

                if (n % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if (n % 5 == 0) {
                System.out.println("Buzz");

            } else {
                System.out.println(n);
            }
        }


        //DISPLAY TABLE OF POWERS
        //  Scanner scanner = new Scanner(System.in);

       /* String userChoice;
        do {
            System.out.print("Enter an integer here:");
            int userInteger = scanner.nextInt();
            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            for (int k = 1; k <= userInteger; k++) {
                int numberSquared = (int) Math.pow(k, 2);
                int numberCubed = (int) Math.pow(k, 3);

                String message = "\n" + k + "       " + numberSquared + "       " + numberCubed;

                System.out.print(message);
                userChoice = scanner.next();
            }
        }while(userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes"));*/






    }
    }
