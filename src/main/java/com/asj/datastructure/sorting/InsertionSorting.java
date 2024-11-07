package com.asj.datastructure.sorting;

public class InsertionSorting {
    public static void main(String[] args) {
        int[] nums = {5,8,2,4,9,6};
        int[] nums1 = {3,6,2,1,5};

        InsertionSorting s = new InsertionSorting();

        System.out.println("Before Sorting: ");
        for (int num:nums){
            System.out.print(num + " ");
        }
        System.out.println();

        s.insertionSort(nums);

        System.out.println("\nAfter Sorting: ");
        for (int num:nums){
            System.out.print(num + " ");
        }
    }

    public void insertionSort(int[] nums){
        for (int i=1; i<nums.length; i++){
            int key = nums[i];
            int j = i-1;
            while (j>=0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1]= key;

            System.out.println();
            for (int num: nums){
                System.out.print(num + " ");
            }
        }
    }
}
