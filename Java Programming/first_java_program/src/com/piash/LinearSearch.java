package com.piash;

public class LinearSearch {
    public static void main(String[] args) {
        int [] nums = { 23, 45, 1, 2,8, 19, -6,-11};
        int target = 0;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
        static int linearSearch (int [] arr, int target) {
        if (arr.length == 0) {
            return -1;

        }
        for (int index = 0; index < arr. length; index++) {
            int element = arr [index];
            if (element == target) {
                return index;
            }
        }

        return -1;
    }
}
