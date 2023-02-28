import java.util.Random;
public class Main {
    public static void main(String[] args){

        // Generates roll using the class Random()
        System.out.println("\nThis program sorts you into a Hogwarts House and more...\n");
        Random rand = new Random(); // Creates instance of the class Random
        int rollBound = 5; // sets the roll from 0-4: 0, 1, 2, 3, 4. Aka sets the upperbound
        int randomRoll = rand.nextInt(rollBound); // Generates the random roll
        System.out.println(randomRoll); // prints the random roll to the console


        // Translates roll into a house
        if(randomRoll == 1){
            System.out.println("\nYou are a Slytherin.");
        }else if(randomRoll == 2){
            System.out.println("\nYou are a RavenClaw.");
        }else if(randomRoll == 3){
            System.out.println("\nYou are a HufflePuff.");
        }else if(randomRoll == 4){
            System.out.println("\nYou are a Gryffindor.");
        }else{
            System.out.println("\nYou were not admitted to Hogwarts because you possess no magical ability. You're a muggle.");
        }


        // Randomly generates the year
        System.out.println("\nWhat year do you begin?");
        int minYear = 1;
        int maxYear = 7;
        int randomYear = (int)Math.floor(Math.random() * (maxYear - minYear + 1) + minYear); // This formula allows the random value to include the min and max values
        System.out.println(randomYear);


        // Generates grade based through the class Random with seed
        System.out.println("\nWhat are your grades in each class from 0 to 100?");
        // Charms, Herbology, Potions, Transfiguration
        String[] classArray = {"Charms", "Herbology", "Potions", "Transfiguration"}; //Creates an array of string values
        Random classRandom = new Random(597);

        for(int i = 0; i < classArray.length; i++){
            System.out.println(classArray[i] + ": " + classRandom.nextInt(101));
        }




    }
}
