package unit1;

public class appofbasicsnotes{
    public static void main(String[] args) {

        // Declaring variables: type name = value;
        int x = 1;
        int y = 2;
        int z = 3;

        //Declare variable named "perimeter" that adds x,y, and z togther
        int perimeter = x + y + z;

        //Print out the perimeter of the triangle
        //System.out.println("The perimeter of the triangle is: " + perimeter + " units");
        System.out.println("The perimeter of the triangle is: " + perimeter);

        /* Comparing side lengths x and y using if/else statements:
            if (condition) {
                do stuff
            }
        */
        if (x > y) {
            System.out.println("Side x is longer");
        } else if (x == y) {
            System.out.println("They are the same");
        } else {
            System.out.println("Side y is longer");
        }

        
        // Using a built-in method

        //Save a string variable as your name
        String name = "Zooooey";
        int length = name.length();
        
        //Use the .length method to find the length of your name

        //Print the length of your name

        System.out.println("The length of your name is " + length + " letters.");
        
    }

}
