public class ControlFlowExercises {
    public static void main(String[] args){


        int i = 5;
        while(i <= 15){
            System.out.println(i);
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

        for(int x = 100; x > -10; x -= 5){
            System.out.println(x);
        }


        for(long y = 2; y < 1000000; y *= y){
            System.out.println(y);
        }

    }
}
