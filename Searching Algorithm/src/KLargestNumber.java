import java.util.Arrays;
import java.util.Collections;

/**
 * Create by saurabh
 * Date: 08/11/23
 * Project Name: Searching Algorithm
 */

public class KLargestNumber {
    public static void main(String[] args) {
        Integer array[] = {12,23,13,24,10,45,36,56,32,31,54,47,52};
        int k=4;
        kLargestNumber(array,k);
    }

    private static void kLargestNumber(Integer[] array, int k) {
        //sorting
        Arrays.sort(array,Collections.reverseOrder());
        for(int i=0;i<k;i++){
            System.out.println(array[i]);
        }
    }

}
