/** 
 * DO NOT DISTRIBUTE THIS FILE. 
 *
 * File: CodeC.java
 */

public class CodeC{ 
    /*
     * Takes one integer array and returns the longest alternating
     * sequence in the array
     * @param int[] array The longest alternation sequence will be found here
     * @return int Returns longest alternation sequence in the array 
     */
    public static int maxAlternating(int[] array){
        //Returns 0 if array is null or less than size 3 
        if(array == null || array.length < 3){
            return 0;
        } 
        //True if numbers in even spaces in the array are the same
        boolean even = false; 
        //First index in the array.
        int evenIndex = array[0];
        //Total count of recurring numbers in the even spaces
        int countEven = 1;
        //Largest number of recurring numbers in even spaces 
        int largestEven = 0; 
        //Goes through integers in even spaces 
        for(int i = 2; i < array.length; i = i + 2){
            //Checks if an int in an even space is equal
            //to the int in the previous even space 
            if( evenIndex == array[i] ){
                even = true;
                countEven = countEven + 1; 
                //Checks if the current count of even numbers is
                //largest than the longest set of consecutive even numbers 
                if( countEven > largestEven ){
                    largestEven = countEven; 
                } 
                    
            }
            //Runs if numbers in the even space are not the same 
            else {
                even = false; 
                evenIndex = array[i];
                countEven = 1;
            }
        }
        //True if numbers in odd spaces in the array are the same
        boolean odd = false;
        //First odd index in the array 
        int oddIndex = array[1];
        //Intial number of consecutive odd numbers 
        int countOdd = 1; 
        //Largest number of reoccuring numbers in odd spaces 
        int largestOdd = 0; 
        //Goes through integers in odd array spaces 
        for (int i = 3; i < array.length; i = i + 2){ 
            //Checks if an int in an even space is equal
            //to the int in the previous space
            if( oddIndex == array[i] ){
                odd = true;
                countOdd = countOdd + 1;
                //Checks if the current count of consecutive odd numbers
                //is longer than the largest set of consecutive odd numbers 
                if( countOdd > largestOdd ){
                    largestOdd = countOdd; 
                }
            }
            else { 
                odd = false;
                oddIndex = array[i];
                countOdd = 1; 
            }
            
        } 
        //True when every element in the array is the same number 
        boolean flag = true;
        //First Element in the array
        int firstElement = array[0];
        //Looks through every element in the array to check if 
        //every number is the same
        for(int i = 1; i < array.length; i++){
            if ( array[i] != firstElement ){
                flag = false;  
            }
        } 
        if( flag ){
            return 0;
        } 

        //Checks if there are consecutive odd numbers and even numbers
        if( even && odd ) {
            //Bad way to Check if the even numbers and odd numbers are consecutive
            if( countOdd == countEven || countOdd == countEven - 1 || 
                    countOdd == countEven + 1 ){
                return largestEven + largestOdd; 
            }
        } 
            return 0;//Returns 0 is there are no consecutive numbers   
    }
}
