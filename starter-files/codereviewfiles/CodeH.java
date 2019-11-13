/** 
 * DO NOT DISTRIBUTE THIS FILE. 
 *
 * File: CodeH.java
 */

/** 
 * Will find the length of the longest alternating sequence
 * */
class CodeH{
    private static final int indexSpacing = 2;
    //prevents index from going out of bound 
    private static int minArrayLength = 2;
    //min length of the alternating array 
    private static int arrayLengthCounter = 2;
    //counter for length of alternating array
    private static int maxArrayLengthCounter = 0;
    //counter for the largest alternating array in the set
    private static int nextCompareIndex = 2;
    // value to skip to next odd/even index
    
    public static int maxAlternating(int[] array){
        /**
         * Takes int array and returns the length of longest alternating sequence
         * @param  int array
         * @return int value of the length of the longest alternating sequence 
         * */


        if (array == null){
            //if input is null, return 0
            return 0;
        }
        else if (array.length < 3){
            // if input array's length is less than 3, return 0
            return 0;
        }

         int arraylength = array.length;
        //find int value of the length of the int array


        for (int index = 0; index < (arraylength - indexSpacing) ; index += 1){
        //Looks for sequence and updates max value counter
            int even = array[index];
            int odd = array[index + 1];
            int nextEven = array[index + nextCompareIndex];
            
            if ((even == nextEven) && (even != odd )) {
                // checks if an alternating sequence exists by
                // checking if the next even value is similar to the previous
                // even value and failing if the even values are the same 
                // as the odd values
                arrayLengthCounter = arrayLengthCounter + 1;
                // updates array length counter

                if (maxArrayLengthCounter < (arrayLengthCounter)){
                    maxArrayLengthCounter = (arrayLengthCounter);
                    //updates max value of array length
                }
            }
            else {
                arrayLengthCounter =  minArrayLength;
                // will reset length value after an alternating sequence ends
            }
        }
        return maxArrayLengthCounter;
        //returns largest array length
    }
}
