package com.aditya;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 18};
        System.out.println(maxRange(arr,1,3));
    }

   // work on edge cases here, like being null
    static int maxRange(int[] arr, int start, int end){
        if(end > start){
            return -1;
        }

        if (arr == null){
            return -1;
        }

        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {

            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    //imagin that arr is not empty
    static int max(int[] arr){
        if (arr.length == 0){
            return -1;
        }
        int maxVal = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {

            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
