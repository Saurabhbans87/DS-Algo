/**
 * Create by saurabh
 * Date: 05/11/23
 * Project Name: Searching Algorithm
 */

public class LargestFourElement {
    public static void main(String[] args) {
        int array[] = {12,34,55,66,34,56,87,52,43,47,80};
        largestFourElement(array);
    }

    private static void largestFourElement(int[] array) {
        int firstNumber=Integer.MIN_VALUE;
        int secondNumber=Integer.MIN_VALUE;
        int thirdNumber=Integer.MIN_VALUE;
        int fourthNumber=Integer.MIN_VALUE;
        for (int i=0;i< array.length;i++){
            if(array[i] > firstNumber){
                fourthNumber = thirdNumber;
                thirdNumber = secondNumber;
                secondNumber = firstNumber;
                firstNumber = array[i];
            }
        }
        System.out.println("First Numebr" +firstNumber+"Second Numebr"+secondNumber+"Third number" +thirdNumber+"Fourth Number"+fourthNumber);
    }
}
