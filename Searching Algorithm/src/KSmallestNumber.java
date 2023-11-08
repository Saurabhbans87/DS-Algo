import java.util.Arrays;
import java.util.Collections;

/**
 * Create by saurabh
 * Date: 08/11/23
 * Project Name: Searching Algorithm
 */

public class KSmallestNumber {
    public static void main(String[] args) {
        Integer array[] = {12,23,10,11,8,13,14,5,15,6,34,18,19,21};
        int k=4;
        kSmallestNUmber(array, k);
    }

    private static void kSmallestNUmber(Integer[] array, int k) {
        //sorint
        Arrays.sort(array);
        for(int i=0;i<k;i++){
            System.out.println(array[i]);
        }
    }
}
