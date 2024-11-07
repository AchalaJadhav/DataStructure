package com.asj.datastructure.searching;

public class AbstractSearch {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6,7,8,9,11};
        int target = 11;
        AbstractSearch search = new AbstractSearch();

        int result1 = search.LinearSearch(nums, target);
        int result2 = search.BinarySearch(nums, target);

        if (result1 == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found by Linear Search: " + result1);

        if (result2 == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found by Binary Search: " + result2);
    }

    public int LinearSearch(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            if (nums[i] == target)
                return i;
        }
        return -1;
    }

    public int BinarySearch(int[] nums, int target){
        //{1,3,5,6,7,8,9,11}
        //target = 3
        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int mid = (left + right)/2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
