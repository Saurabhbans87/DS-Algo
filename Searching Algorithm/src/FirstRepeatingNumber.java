/**
 * Create by saurabh
 * Date: 05/11/23
 * Project Name: Searching Algorithm
 */

public class FirstRepeatingNumber {
    public static void main(String[] args) {
        int array[] ={1,2,3,10,12,34,4,8,10,12,23,3,45};
        int repeatingNumber = firstRepeatingNumber(array);
        if(repeatingNumber==-1){
            System.out.println("No repeating number");
        }else{
            System.out.println("Repeating number is " +array[repeatingNumber]);
        }
    }

    private static int firstRepeatingNumber(int[] array) {
        for(int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i]==array[j]){
                    return i;
                }
            }
        }
        return -1;
    }
}
