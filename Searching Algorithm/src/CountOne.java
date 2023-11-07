import java.util.Arrays;

/**
 * Create by saurabh
 * Date: 07/11/23
 * Project Name: Searching Algorithm
 */

public class CountOne {
    public static void main(String[] args) {
        int array[] ={0,0,1,1,0,1,1,0,0};
        int arr[] = { 1, 1, 1, 1, 0, 0, 0 };
        countOne(array);
        usingBruteForce(array);
        int count = usingBinarySearch(arr);
        System.out.println("Count iss "+count);
    }

    private static int usingBinarySearch(int[] arr) {
        int low=0; int high= arr.length;
        int mid = (low + high) / 2;
        while(low<=high){
            if(arr[mid] < 1){
                high = mid-1;
            }
            else if(arr[mid]>1){
                low = mid+1;
            }else{
                if (mid == arr.length-1 || arr[mid + 1] != 1)
                    return mid + 1;
                else
                    low = mid + 1;
            }
        }
        return 0;
    }

    private static void usingBruteForce(int[] array) {
        int count=0;
        for(int i=0;i< array.length;i++){
            if(array[i]==1){
                count++;
            }
        }
        System.out.println("Count is "+count);
    }

    private static void countOne(int[] array) {
        long total=Arrays.stream(array).filter(i->i==1).count();
        System.out.println("Total number is "+total);
    }

}
