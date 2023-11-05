/**
 * Create by saurabh
 * Date: 05/11/23
 * Project Name: Searching Algorithm
 */

/**
 * Java program to print largest 4 number
 */
public class LargestFourElement {
    public static void main(String[] args) {
        int array[] = {12,34,55,66,34,56,87,52,43,47,80};
        largestFourElement(array);
    }
    /**
     *
     * @param array
     */
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
        // Calling the System.lineSeparator() function to
        // print newline in between number
        String newline = System.lineSeparator();
        System.out.println("First Numebr " +firstNumber+newline+
                "Second Numebr "+secondNumber+newline+
                "Third number " +thirdNumber+newline+
                "Fourth Number "+fourthNumber);
    }
}
