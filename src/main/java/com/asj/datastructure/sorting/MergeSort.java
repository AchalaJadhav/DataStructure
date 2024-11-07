package com.asj.datastructure.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,5,9,1,6,7};

        System.out.println("Before Sorting");
        for (int num:arr){
            System.out.print(num + " ");
        }

        mergeSort(arr, 0, arr.length-1);

        System.out.println("\nAfter Sorting");
        for (int num:arr){
            System.out.print(num + " ");
        }
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right){
            int mid = (left + right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1; //Because 2 - 0 = 2 only, but we want 3 as length, so + 1
        int n2 = right - mid; //Because mid is already one step behind the half

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        //Copy the values
        for (int i = 0; i<n1; i++){
            lArr[i] = arr[left+i]; //Didn't got this
        }

        for (int i = 0; i<n2; i++){
            rArr[i] = arr[mid+1+i]; //Didn't got this
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i<n1 && j<n2){
            if (lArr[i] <= rArr[j]){
                arr[k] = lArr[i];
                i++;
            }else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        while (i<n1){
            arr[k] = lArr[i];
            i++;
            k++;
        }

        while (j<n2){
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }
}