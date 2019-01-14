import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Talk to Bob");
        String userInput = scanner.next();
        boolean endConversation;
        do {
            userInput = scanner.next();
            endConversation = (userInput.equals("bye"));
            if (userInput.endsWith("?")) {
                System.out.println("Sure");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals(" ")) {
                System.out.println("Fine.Be that way!");
            } else {
                System.out.println("Whatever");
            }
        }while(endConversation);
    }
}
