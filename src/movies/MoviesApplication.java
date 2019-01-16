package movies;
import util.Input;

    public class MoviesApplication {

        public static void main(String[] args) {
            Input input = new Input();

            Movie[] movies = MoviesArray.findAll();

            for(Movie movie : movies) {
//            System.out.println(movie.getName());
//            System.out.println(movie.getCategory());
//            System.out.println("------");
            }




            System.out.println("What would you like to do?");
            System.out.println("0 = exit");
            System.out.println("1 = view all movies");
            System.out.println("2 = view movies in the animated category");
            System.out.println("3 = view movies in the drama category");
            System.out.println("4 = view movies in the horror category");
            System.out.println("5 = view movies in the scifi category\n");
            int inputNumber = input.getInt(0,5);
//                runMenu(inputNumber);


//                working but only runs once. doesn't do recursion:
            do {
                for (Movie movie : movies) {
                    if (inputNumber == 1) {
                        System.out.println(movie.getName() + " - - " + movie.getCategory());
                        System.out.println(". . . . . . . ");
                    } else if (inputNumber == 2) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.println(movie.getName());
                            System.out.println(". . . . . . . ");
                        }
                    } else if (inputNumber == 3) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getName());
                            System.out.println(". . . . . . . ");
                        }
                    } else if (inputNumber == 4) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getName());
                            System.out.println(". . . . . . . ");
                        }
                    } else if (inputNumber == 5) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.println(movie.getName());
                            System.out.println(". . . . . . . ");
                        }
                    }
                }
                System.out.println();
                System.out.println();
                System.out.println("🎬 🍿 🎦 🎬 🍿 🎦 🎬 🍿 🎦 🎬 🍿 🎦 🎬 🍿 🎦🎬 🍿 🎦");
                System.out.println();
                System.out.println("What would you like to do?");
                System.out.println();
                System.out.println("0 = exit 🚫");
                System.out.println("1 = view all movies 🎞");
                System.out.println("2 = view movies in the animated category 👸🐶");
                System.out.println("3 = view movies in the drama category 🤭");
                System.out.println("4 = view movies in the horror category 😨");
                System.out.println("5 = view movies in the scifi category 👽2\n");
                inputNumber = input.getInt(0,5);

            }while(inputNumber!=0);
            if (inputNumber == 0) {

                System.exit(1);
            }


// closes main:
        }


//    trying to do it with recursion-- UNFINISHED:
// public static int runMenu(int inputNumber){
//    Movie[] movies = MoviesArray.findAll();
//    Input input = new Input();
////     System.out.println("What would you like to do?");
////     System.out.println("0 = exit");
////     System.out.println("1 = view all movies");
////     System.out.println("2 = view movies in the animated category");
////     System.out.println("3 = view movies in the drama category");
////     System.out.println("4 = view movies in the horror category");
////     System.out.println("5 = view movies in the scifi category\n");
////    inputNumber = input.getInt(0,5);
//
//         for (Movie movie : movies) {
//             if (inputNumber == 1) {
//                 System.out.println(movie.getName() + " - - " + movie.getCategory());
//                 System.out.println(". . . . . . . ");
//             } else if (inputNumber == 2) {
//                 if (movie.getCategory().equals("animated")) {
//                     System.out.println(movie.getName());
//                     System.out.println(". . . . . . . ");
//                 }
//             } else if (inputNumber == 3) {
//                 if (movie.getCategory().equals("drama")) {
//                     System.out.println(movie.getName());
//                     System.out.println(". . . . . . . ");
//                 }
//             } else if (inputNumber == 4) {
//                 if (movie.getCategory().equals("horror")) {
//                     System.out.println(movie.getName());
//                     System.out.println(". . . . . . . ");
//                 }
//             } else if (inputNumber == 5) {
//                 if (movie.getCategory().equals("scifi")) {
//                     System.out.println(movie.getName());
//                     System.out.println(". . . . . . . ");
//                 }
//             }
//             runMenu(inputNumber);
//         }
//
//        if(inputNumber == 0){
//            System.exit(1);
//         } return inputNumber;
//    }



// closes class:
    }


