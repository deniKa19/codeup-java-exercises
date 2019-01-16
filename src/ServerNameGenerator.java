import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {


        String[] adj = new String[10];
        adj[0] = new String("aggressive");
        adj[1] = new String("agreeable");
        adj[2] = new String("ambitious");
        adj[3] = new String("brave");
        adj[4] = new String("calm");
        adj[5] = new String("delightful");
        adj[6] = new String("eager");
        adj[7] = new String("faithful");
        adj[8] = new String("doubtful");
        adj[9] = new String("excited");



        //private static String[] noun = {"child", "world", "school", "family", "state", "place", "part", "case", "number", "home"};


        //public static void main(String[] args){
            Random random = new Random();
            System.out.println(adj[random.nextInt(adj.length-1)]);

        }
    }


