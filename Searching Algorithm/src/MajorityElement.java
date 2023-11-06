/**
 * Create by saurabh
 * Date: 06/11/23
 * Project Name: Searching Algorithm
 */

public class MajorityElement {
    public static void main(String[] args) {
        int array[] = {2,3,4,5,6,7,2,3,3,3,3,3,3};
        int element = majorityElement(array);
        System.out.println("Majority element is "+element);
    }

    private static int majorityElement(int[] array) {
        int arrayLenfth = array.length;
        int count=0; int max=0; int maxCount =0;
        for(int i=0;i<arrayLenfth;i++){
            for(int j=i+1;j<arrayLenfth;j++){
                if(array[i]==array[j]){
                    count++;
                }
            }
            if(count>maxCount){
                max = array[i];
                maxCount = count;
            }
        }
        if(maxCount>arrayLenfth/2){
            return max;
        }
        else{
            return Integer.MIN_VALUE;
        }
    }
}
