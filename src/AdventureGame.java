import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Create your Hero Name: ");
        String heroName = scanner.next();
        System.out.println("Who are you fighting:");
        String enemyName = scanner.next();
        System.out.println("Welcome " + heroName + "! \nWould you like to start? [Y/N]");
        String heroStart = scanner.next();
        if (heroStart.equalsIgnoreCase("y")){
            //start game
            System.out.println(heroName + " Stats: ");
            int heroHealth = 100;
            System.out.println("Health = " + heroHealth);
            int heroVegetable = 5;
            System.out.println("Vegetable = " + heroVegetable);
            System.out.println("**********************");
            System.out.println();
            System.out.println(enemyName + " Stats: ");
            int enemyHealth = 100;
            System.out.println("Health = " + enemyHealth);
            int candyBar = 3;
            System.out.println("Candy Bar = " + candyBar);
            System.out.println("**********************");
            System.out.println();
            do {
                System.out.println("What would you like to do?\n1. Attack?\n2. Eat a Vegetable?\n3. Run Away?");
                String heroAnswer = scanner.next();
                if (heroAnswer.equalsIgnoreCase("1")) {
                    if (heroHealth > 0 && enemyHealth > 0) {
                        System.out.println(heroName + " attacks. -20 to " + enemyName + "!");
                        System.out.println();
                        System.out.println(enemyName + " attacks. -20 to " + heroName + "!");
                        enemyHealth -= 20;
                        heroHealth -= 20;
                        System.out.println();
                        System.out.println(enemyName + " Health: " + enemyHealth);
                        System.out.println(heroName + " Health: " + heroHealth);
                        if (enemyHealth <= 0){
                            System.out.println("Game Over! " + heroName + " Wins!");
                        } else if (heroHealth <= 0){
                            System.out.println("Game Over! " + enemyName + " Wins!");
                        }
                    }
                } else if (heroAnswer.equalsIgnoreCase("2")) {
                    if(heroVegetable != 0){
                        System.out.println(heroName + " eats a vegetable. +10 to " + heroName);
                        heroHealth += 10;
                        heroVegetable -= 1;
                        System.out.println(heroName + " Health: " + heroHealth + "\nVegetable: " + heroVegetable);
                        if (candyBar != 0) {
                            enemyHealth += 5;
                            candyBar -= 1;
                            System.out.println(enemyName + " eats a candy bar. +5 to " + enemyName);
                            System.out.println(enemyName + " Health: " + enemyHealth + "\nCandy Bar: " + candyBar);
                        }
                    }else {
                        System.out.println("You ran out of vegetables!");
                    }
                } else {
                    System.out.println("Leaving so soon, " + heroName + "?");
//                    enemyHealth = 0;
                }
            } while (enemyHealth != 0);
        }
    }
}





