import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %f \n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer:");
        int integer = scanner.nextInt();

        System.out.println("Enter three different words:");
        String words = scanner.nextLine();

        String first = scanner.next();
        String second = scanner.next();
        String third = scanner.next();

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        System.out.println(sentence);

        //BONUS TO ACCEPT DECIMALS
        System.out.println("Enter the length of the classroom:");
        int length = Integer.parseInt(scanner.nextLine());
        //double length = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the width of the classroom:");
        int width = Integer.parseInt(scanner.nextLine());
        //double width = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the height of the classroom:");
        int height = Integer.parseInt(scanner.nextLine());
        //double height = Double.parseDouble(scanner.nextLine());

        int area = length * width;
        //double area = length * width;
        System.out.println("The area of the classroom is: " + area);
        int perimeter = (length*2) + (width*2);
        //double perimeter = (length*2) + (width*2);
        System.out.println("The perimeter of the classroom is: " + perimeter);
        int volume = length * width * height;
        //double volume = length * width * height;
        System.out.println("The volume of the classroom is: " + volume);










    }
}
