/** 
 * DO NOT DISTRIBUTE THIS FILE. 
 *
 * File: CodeD.java
 */

/**PA0Starter - this class contains the maxAlternating method.
 * maxAlternating - this method takes in an integer array and returns the length of the longest
 * alternating sequence in the array as an integer.**/

public class CodeD{
    public static int maxAlternating(int[] array){
        if(array == null){
            return 0;
        }

        if(array.length < 3){
            return 0;
        }

      
        int maxLength = 0; 
        for (int i=0; i<array.length; i+=2){

            int valOne = array[i]; 
            if (i+1 >= array.length ){
                break;
            }

            int valTwo = array[i+1];
            if (valOne == valTwo){
                continue;
            }
            int tempVal = 0;
            for (int j=i+2; j<array.length; j+=2){
                if (array[j]==valOne){
                    tempVal++;
                }else{
                    break;
                }

                if ((j+1)<array.length && array[j+1]==valTwo){
                    tempVal++;
                }else{
                    break;
                }
            }

            if (tempVal>maxLength){
                maxLength = tempVal;
            } 
        }

        maxLength += 2;
        if (maxLength <3){
            return 0;
        }

        return maxLength;

    }
}
