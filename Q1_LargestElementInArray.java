package StriversDSASheet;
/*
Find the Largest element in an array
Problem Statement: Given an array, we have to find the largest element in the array.
I/P: {3,2,1,5,2}
O/P: 5
 */

import java.util.Arrays;
import java.util.Scanner;

class Solution{

    // Brute
    public int largestElementBrute(int[] arr){
        Arrays.sort(arr);
        int result = arr[arr.length-1];
        return result;
    }

    // Optimal
    public int largestElementOptimal(int[] arr){

        int largest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}

public class Q1_LargestElementInArray{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Solution solution = new Solution();
        int[] inputArray;

        System.out.println("Enter size of array: ");
        int inputSize = input.nextInt();
        inputArray = new int[inputSize];
        System.out.println("Enter elements of array one by one: ");
        for(int i=0; i<inputSize; i++){
            inputArray[i] = input.nextInt();
        }
        
        int result1 = solution.largestElementBrute(inputArray);
        System.out.println("Result (Brute): "+result1);

        int result2 = solution.largestElementOptimal(inputArray);
        System.out.println("Result (Optimal): "+result2);

        input.close();
    }
}