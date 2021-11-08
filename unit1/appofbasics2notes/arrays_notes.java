package unit1.appofbasics2notes;

public class arrays_notes {
    
    public static void main(String[] args){
       
        // Define an array named food that contains 4 elements
        // To define all elements in array: Type[] name = {item1, ..., item4};
        
        // String[] food = new String[5]; <- use if you need to put every element in individually
        

        /* To define elements in array one at a time: 
        Type[] name = new Type[#ofelements];
        name[0] = value;
        ...
        name[i] = value;
        */

        // food[0] = "dumplings";

        String[] food = {"apple", "orange", "pear", "peach", "brownie"};



        // Use a for loop to iterate over every element in food and print the value of each element
        for (int i = 0; i < food.length; i++) {
            System.out.println(food[i]);
        }
        
    }
}
