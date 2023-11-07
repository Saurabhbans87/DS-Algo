import java.util.Arrays;

/**
 * Create by saurabh
 * Date: 07/11/23
 * Project Name: Searching Algorithm
 */

public class CountOne {
    public static void main(String[] args) {
        int array[] ={0,0,1,1,0,1,1,0,0};
        countOne(array);
    }

    private static void countOne(int[] array) {
        long total=Arrays.stream(array).filter(i->i==1).count();
        System.out.println("Total number is "+total);
    }

}
