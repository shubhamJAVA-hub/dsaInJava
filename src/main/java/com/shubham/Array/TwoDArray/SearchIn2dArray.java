package com.shubham.Array.TwoDArray;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7},
                {8,9,23,87,12},
                {10,15}
        };
        int target = 12;
        System.out.println(Arrays.toString(search(arr,target)));
    }

    public static int[] search(int[][] arr, int target){
        if (arr.length == 0 || arr == null){
            return new int[]{-1, -1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
