package com.asj.datastructure.sorting;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] nums = {5,8,2,4,9,6};
        int[] nums2 = {5,8,2,4,9,6};
        System.out.println("Before Sorting: ");
        for (int num: nums){
            System.out.print(num + " ");
        }

        SelectionSorting s = new SelectionSorting();
        s.minIndexSort(nums);

        s.maxIndexSort(nums2);


    }

    public void minIndexSort(int[] nums){
        int minIndex = -1;
        int temp = 0;
        System.out.println("\n\nUsing Min Index");

        for (int i=0; i<nums.length-1; i++){
            minIndex = i;
            for (int j=i; j<nums.length; j++){
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

            System.out.println();
            for (int num: nums){
                System.out.print(num + " ");
            }
        }
        System.out.println("\nAfter Sorting: ");
        for (int num: nums){
            System.out.print(num + " ");
        }
    }

    public void maxIndexSort(int[] nums){
        int maxIndex = -1;
        int temp = 0;

        System.out.println("\n\nUsing Max Index");
        for (int i=nums.length-1; i>0; i--){
            maxIndex = 0;
            for (int j=1; j<=i; j++){
                if (nums[maxIndex] < nums[j]){
                    maxIndex = j;
                }
            }
            temp = nums[maxIndex];
            nums[maxIndex] = nums[i];
            nums[i] = temp;

            System.out.println();
            for (int num: nums){
                System.out.print(num + " ");
            }
        }
        System.out.println("\nAfter Sorting: ");
        for (int num: nums){
            System.out.print(num + " ");
        }
    }
}
