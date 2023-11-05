/**
 * Create by saurabh
 * Date: 05/11/23
 * Project Name: Searching Algorithm
 */

public class MaxAppearingNumber {
    public static void main(String[] args) {
        int array[] = {1,2,3,2,2,3,4,1,2,3,4,6,3,4,5,8,9,6,8,9,5,7,9,9,8,7,6,7,5};
        System.out.println("Max appearing number in the given array is ");
        maxAppearingNumberInTheArray(array);
    }
    private static void maxAppearingNumberInTheArray(int[] array) {
        int arrayLength = array.length;
        int maxAppearingNumber = array[0];
        int maxCount=1;
        int count=1;
        for(int i=0;i< arrayLength;i++){
            count=1;
            for(int j=i+1;j<arrayLength;j++){
                if(array[i]==array[j]){
                    count++;
                }
            }
            if(count>maxCount){
                maxAppearingNumber=array[i];
                maxCount=count;
            }
        }
        System.out.println("Max appearing number is " +maxAppearingNumber);
    }
}
