/** 
 * DO NOT DISTRIBUTE THIS FILE. 
 *
 * File: CodeF.java
 */

/* The class PA0Starter defines the method maxAlternating using the
 * starter code given in the assignment. It also contains the 
 * examples for maxAlternating in main. It does not contain any 
 * instance variables. */
public class CodeF{
   /* maxAlternating is a method that takes an int array and returns
    * the length of the max alternating sequence in the array. The 
    * minimum number it may return is 3 and will return 0 for anything
    * under that value. In addition, if all integers in the array are 
    * same, the method will return 0 due to the values not alternating.
    * @param array The int[] array in question
    * @return count2 The largest length of alternating sequence in the array */
    public static int maxAlternating(int[] array) {
        int count1 = 2;
        int max = 0;
        if (array == null) {
            return 0;
        }
        else {
            int size = array.length;
            for (int i = 0;i < (size-2); i++) {
                if (((size > 2) && (array[i] == array[i+2])) && (array[i] != array[i+1])) { 
                   count1++;
                   max = count1;
                }
                else {
                   max = 0;
                }
             }
            return max;
        }
     }
}

