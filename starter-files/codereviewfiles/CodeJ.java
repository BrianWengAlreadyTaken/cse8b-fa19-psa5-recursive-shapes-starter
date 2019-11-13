/** 
 * DO NOT DISTRIBUTE THIS FILE. 
 *
 * File: CodeJ.java
 */

/**
 * This class is to return the length of the longest alternating sequence.
 *
 */

public class CodeJ{
    /**
     * Returns the length of the longest alternating sequence in the array.
     * @param array The desired integer array
     * @return The length of the longest alternating sequence.
     *
     */
	public static int maxAlternating(int[] array){

		if(array == null || array.length < 3){
			return 0;
		}
		int count = 2;
		int maxCount = 0;

		for(int i=1; i<array.length-1; i++){
			if((array[i-1]==array[i+1])&&(array[i]!=array[i-1])){
					++count;
					}
					else{
					if((count>maxCount)&&(count>2)){
					maxCount=count;
					}
					count = 2;
					}

			}
		return maxCount;
	}
}






