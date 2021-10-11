import java.util.ArrayList;
import java.util.Arrays;

import jdk.jfr.Timestamp;


/**
 * Class that provides helper functions for ArrayList
 */
public class ArrayListUtils {

    /**
     * Calculates total sum of all elements in the given array
     *
     * @param arr array list of integers for which we calculate sum
     * @return the total sum of all elements in the array
     */
    public static int sum(ArrayList<Integer> arr) {
        // TODO: implement this method on a separate branch. Should return sum of all elements in the array list
        int sum = 0; 
        for (Integer i: arr)
            sum += i;
        
        return sum;
    }

    /**
     * Calculates average value of all elements in the given array
     *
     * @param arr array list of integers for which we calculate average
     * @return average value of all elements in the array
     */
    public static int mean(ArrayList<Integer> arr) {
        // TODO: implement this method on a separate branch. Should return the average of elements in the array list
        int sum = 0;
        for (Integer i: arr) {
            sum += i;
        }
        int mean = (arr.size() != 0) ? (sum / arr.size()): 0;
        return mean;
    }

    @Test
    public void testMean() {
        //all positive
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        int testSum = sum(arr);
        assertEquals(testSum, 6);
       
        //all negative
        arr = new ArrayList<Integer>(Arrays.asList(-1, -2, -3));
        testSum = sum(arr);
        assertEquals(testSum, -6);

        //mix negative positive
        arr = new ArrayList<Integer>(Arrays.asList(-1, -2, 3));
        testSum = sum(arr);
        assertEquals(testSum, 0);
        
        //empty array
        arr = new ArrayList<Integer>();
        testSum = sum(arr);
    }
}
