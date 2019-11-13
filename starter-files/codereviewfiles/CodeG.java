/** 
 * DO NOT DISTRIBUTE THIS FILE. 
 *
 * File: CodeG.java
 */

public class CodeG{
    /** The purpose of this class is to hold the PSA0 method maxAlternating().
     *  This class is capable of finding the number of alternations in an int[].
     **/ 

    /** Returns the longest consecutive alternations between two ints in array.
     *  @param array The array of ints
     *  @return the length of the longest alternat
     **/
    public static int maxAlternating(int[] array) {
        int maxAlt = 0; // Will record maximum alternations
        int currentAlt = 0; // Will record the current alternations
        int oddNum = 3; // Used for odd number alternations
        int evenNum = 2; // Used for even number alternations


        if(array == null || array.length < 3 ) {
            //Detects if array does not meet length requirement
            maxAlt = 0;
            return maxAlt;
        } 

        for(int i = 0; i < array.length; i++) {

            if (i == 0 && array[i] == array[i + evenNum] && array[i] != array[i + 1]) {
                // Only ran at the 0th index if an alternation is detected

                if ( array[i+1] != array[i + oddNum] ) {
                    // If alternations stop after first three indexes, add 3
                    currentAlt = currentAlt + oddNum;
                    System.out.println("Plus 3 @ i = " + i);
                    

                } else {
                    // If alternations continue, add 2 
                    currentAlt = currentAlt + evenNum;
                    System.out.println("Plus 2 @ i = " + i);
                }
           
            } else if ( i > 1 && array[i - evenNum] == array[i] && array[i] != array[i - 1] ) {
                // Runs if an alternation detect past the 1st index.
                
                if ( oddNum > i && currentAlt != evenNum && array[i] == array[i - evenNum] && array.length > (2 * evenNum) && array[i] != array[i + 1] && array[i - 1] == array[i + 1] ) {
                    // Should only be ran if i = 2 and the first if statement was previously true when i = 0
                    currentAlt = currentAlt + evenNum;
                    System.out.println("Plus 2 @ i = " + i);
                
                } else if ( i > evenNum && currentAlt > 0 && array[i - 1] != array[i - evenNum] )  {
                    // Adds the length between alternations for even # indexes checking that no alternation was recorded for previous odd # alternation
                    currentAlt = currentAlt + evenNum;
                    System.out.println("Plus 2 @ i = " + i);
                
                } else if ( i > evenNum && currentAlt == 0 ) {
                    // Adds the length between alternations
                    currentAlt = currentAlt + evenNum;
                    System.out.println("Plus 2 @ i = " + i);                 
                }
            } 

            if ( i > 2 && currentAlt > 0 && array[i] != array[i-1] && array[i] != array[i-2] ) {
                    
                if ( currentAlt > maxAlt ) {
                    //Updates maxAlt before currentAlt is reset
                    maxAlt = currentAlt;
                }
                currentAlt = 0; //Resets currentAlt if these params are true
                System.out.println("currentAlt reset @ i = " + i + " maxAlt @ " + maxAlt);
            }
            
            if ( currentAlt > maxAlt ) {
                maxAlt = currentAlt;

                if( maxAlt > array.length ) {
                    //In case length is an odd number & entire array is an alternation, reverts maxAlt to arrays length since method adds by 2
                    System.out.println("maxAlt @ " + maxAlt + " exceeds array's length @ " + array.length + ", maxAlt reset to array's length.");
                    maxAlt = array.length;
                }
            }
        }
        return maxAlt;
    } 
}


