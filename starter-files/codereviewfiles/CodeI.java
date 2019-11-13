/** 
 * DO NOT DISTRIBUTE THIS FILE. 
 *
 * File: CodeI.java
 */

/** This class contains the maxAlternating method.
 **/
public class CodeI{
   /** maxAlternating takes in an int array and outputs the length of longest sequence of alternating values.
    * Special cases would be if there are more than one alternating sequence or the array is null.
    * If there is more than one alternating sequence, the longest will be used.
    * If the array is null or has no values, 0 will be returned.
    * If the array is contains less than 3 values, 0 will be returned since an alternating sequence needs at least 3 values.
    **/
    public static int maxAlternating(int[] array) {
        //currentSequence records the length of the current sequence for each value tested.
        int currentSequence = 0;
        //longestSequence records the length of the longest sequence
        int longestSequence = 0;
        //if the array is null, 0 is returned
        if (array == null) {
            return 0;
        }
        //only returns a value other than 0 if the length of the array is greater than 2.
        if (array.length > 2) {
            for (int i = 0; i < array.length; i++) {
                
                //add 3 to currentSequence if i is 0 and its value equals the value at i + 2, but not i + 1
                if ((i == 0) && ((array[i] == array[i + 2]) && (array[i] != array[i + 1]))) {
                        currentSequence = currentSequence + 3;
                }
                //adds 2 to currentSequence if the values of i + and - 1 are equal to eachother but not the value at i
                //only if i is greater than 1
                else if ((((i > 1) && (i < array.length - 1))) && ((array[i - 1]) == (array[i + 1]) && (array[i] != array[i -1]))) {
                        currentSequence = currentSequence + 2;
                }
                //makes longestSequence equal to currentSequence if currentSequence has a bigger value
                else {
                    if (currentSequence > longestSequence) {
                        longestSequence = currentSequence;
                    }
                    //makes currentSequence 0
                    currentSequence = 0;
                }
            }
        }
        return longestSequence; 
    }
}
