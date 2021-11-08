package unit1.appofbasics2notes;

public class forloopsnotes {
    public static void main(String[] args) {
        
        System.out.println("For loop:");
        
        //create a for loop that iterates from 10 to 1 and prints the outcome
        /* for (declaration; check; incrementation) {
                do stuff
        }
        */

        for (int x = 10; x == 0; x -= 1) {
            System.out.println(x);
        }

        System.out.println("While loop:");
        
        //declare a variable named x with the value 10

        int x = 10;

        //Create a while loop that iterates from 10 to 1 and prints every number
        /* while (condition) {
                do stuff
        } */

        while (x > 0) {
            System.out.println(x);
            x -= 1;
        }
        
    }
}
