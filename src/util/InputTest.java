package util;

public class InputTest {
    public static void main(String[] args) {

        Input input1 = new Input();
        System.out.println("enter favorite number:");
        int favoriteNumber = input1.getInt();
        System.out.println(favoriteNumber);

        System.out.println("What is your name?");
        String name = input1.getString();
        System.out.println(name);

        System.out.println("Enter y or yes:");
        boolean yes = input1.yesNo();
        System.out.println(yes);

        int range = input1.getInt(1, 20);
        System.out.println(range);

        System.out.println("enter a decimal number:");
        double decimalNumber = input1.getDouble();

        double rangeDecimal = input1.getDouble(1.5, 25.9);
        System.out.println(rangeDecimal);

    }
}
