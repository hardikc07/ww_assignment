import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class generateRandomNo {

    public static void main(String args[]) {
        System.out.println("\n \n 5th smallest no: " + nThSmallestNo());
    }

    public static int nThSmallestNo() {
        // create instance of Random class
        Random rand = new Random();
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < 500; i++)
            // Generate random integers in range 0 to 9999
            result.add(rand.nextInt(10000));

        // Sorting arraylist
        Collections.sort(result);
        System.out.println("Total 500 Random No \n" + result.toString());
        //returning 5th index of an array list
        return result.get(4);

    }
}
