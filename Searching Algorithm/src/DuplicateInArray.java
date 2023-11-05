import java.util.HashSet;

/**
 * Create by saurabh
 * Date: 05/11/23
 * Project Name: Searching Algorithm
 */

public class DuplicateInArray {
    public static void main(String[] args) {
        int array[] = {3,4,5,6,7,8,9,3};
        System.out.println("Duplicate numebr using Brute force");
        int duplicateNumber = duplicateNumberByBruteForce(array);
        System.out.println("Duplicate number is "+duplicateNumber);
        System.out.println("Duplicate number void method");
        voidDuplictaeNumber(array);
        System.out.println(" ");
        System.out.println("Duplicate number using hashtable");
        duplicateUsingHashtable(array);
    }

    private static void duplicateUsingHashtable(int[] array) {
        HashSet hashSet = new HashSet();
        for(int i=0;i<array.length;i++){
            if(hashSet.contains(array[i])){
                System.out.println("Duplicate number is " +array[i]);
            }else{
                hashSet.add(array[i]);
            }
        }
    }

    private static void voidDuplictaeNumber(int[] array) {
        for(int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i]==array[j]){
                    System.out.print("Duplicate number is " +array[i]);
                }
            }
        }
    }

    private static int duplicateNumberByBruteForce(int[] array) {
        for(int i=0; i<array.length;i++){
            for(int j=1;j<array.length;j++){
                if(array[i]==array[j]){
                    return array[i];
                }
            }
        }
        return 0;
    }
}
