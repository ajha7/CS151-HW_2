import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
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
        return 0;
    }

    /**
     * Calculates average value of all elements in the given array
     *
     * @param arr array list of integers for which we calculate average
     * @return average value of all elements in the array
     */
    public static int mean(ArrayList<Integer> arr) {
        // TODO: implement this method on a separate branch. Should return the average of elements in the array list
        return 0;
    }

    @Test 
    public void testSum() {
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
        System.out.println("IN UNIT TEST");
        System.out.println(arr.toString());
        testSum = sum(arr);
        assertEquals(testSum, 0);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ArrayListUtils.class);
		
        System.out.println("Failures: \n");
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Result: \n");
        System.out.println(result.wasSuccessful());
    }
}
