/** 
 * DO NOT DISTRIBUTE THIS FILE. 
 *
 * File: CodeA.java
 */

/** The following class has no instance variables. 
 * It takes in an array of integers and it checkes if there is a sequence of 3 or more entries
 */
public class CodeA {
    /**
     * Takes in an array of integers and it first eliminates any edge cases.
     * Then checks if the a certain entry repeats when the index is even 
     * and if another entry repeats when the index is odd
     * It counts times this patter repeats by using int count
     * @param array: array of integers to check
     * @return count: number of times pattern repeats.
     */
    public static int maxAlternating(int[] array){
        int count = 0; //int count will count the number of alternating entries 

        // first eliminate edge cases//
        if (array == null || array.length < 3){
            return 0;
        }
        //array needs to have at least 3 numbers
        if(array.length > 3){

            for (int index = 0; index < array.length; index++){

                if (array[index]== array[index+1] || array[index+1] != array[index+2]){
                    return count;

                }
                if (array[index] == array[index+2]){
                    count+=1;
                }
                if (array[index] != array[index+1]){
                    count+=1;
                }       

            }
        }
        return count;
    }

}
