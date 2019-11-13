/** 
 * DO NOT DISTRIBUTE THIS FILE. 
 *
 * File: CodeB.java
 */

/** This class will test multiple arrays and return the maximum alternating
 * numbers that occur in the array.
 * Important Instance Variables:
 *  failResult_numb is used to set a number that will be returned for cases 
 *      that do not have any alternating numbers. 
 *  result_numb is used to increment each time there is an alternating series,
 *      it starts at 2 in order to increment once for 3 alternations. 
 *  resultTester_numb is the number that will determine whether the method will
 *      return 0 or a number greater than 3, because the least alternations 
 *      possible is 3.
 * */

class CodeB{

    private static final int failResult_numb = 0;
    private static final int result_numb = 2;
    private static final int numberTwo_numb = 2;
    private static final int resultTester_numb = 3;

    /** This method will run a series of tests to determine how many
     * alternating series there is in an array.
     * Special cases: The method tests for a null or an array that is less
     * than 3.
     *
     * @param: int[] array Tested for alternating 
     * @return maximum alternating
     * */

    public static int maxAlternating(int[] array){

        int failResult = failResult_numb;
        int result = result_numb;
        int numberTwo = numberTwo_numb;
        int resultTester = resultTester_numb;

        //Tests for an edge case of null or less than 3 array
        if(array == null || array.length <= numberTwo){
            return failResult;
        }
        else {
            //A loop that runs from 0 to the array length less than 2 since
            //an array can't start a alternating series with 2 numbers.
            for(int i = 0; i < array.length - numberTwo; i+= 1){
                //Tests if the even numbers are equal
                if(array[i] == array[i + numberTwo]){
                    //Tests if the next number is equal
                    if(array[i+1] != array[i]){
                        result = result + 1;
                    }
                    else {
                        failResult = failResult;
                    }}
                else {
                    failResult = failResult;
                }
            }
            //Tests if there is an alternating series
            if(result >= resultTester){
                return result;
            }
            else{
                return failResult;
            }
        }
    }
}

