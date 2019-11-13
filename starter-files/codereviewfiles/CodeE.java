/** 
 * DO NOT DISTRIBUTE THIS FILE. 
 *
 * File: CodeE.java
 */

/* This class PA0Starter contains a static method named maxAlternating
which we will also test inside the main method
*/
public class CodeE{
    // Method takes an array and returns the length of the longest sequence
    public static int maxAlternating(int[] array){
        int lengthOfAlternating =0;
        int evenNumbers = 2;
        // this loop runs through the array and checks to see if every other value is the same
        for(int i = 0; i<array.length - 3; i++){
            if(array == null){
                lengthOfAlternating = 0;
            }
            else if(array[i] == array[i + 2]){
                lengthOfAlternating = 3;
                if(array[i+1] == array[i + 3]){
                    lengthOfAlternating++;
                    evenNumbers+=2;
                }
             }
        }
                

               
            
        
        return lengthOfAlternating;
    }
}

    

