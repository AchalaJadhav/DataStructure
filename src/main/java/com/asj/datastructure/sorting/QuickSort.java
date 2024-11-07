package com.asj.datastructure.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {-44,-98,1,1,88,9,79};

        System.out.println("Before Sorting: ");
        for (int num: arr){
            System.out.print(num + " ");
        }

        quickSort(arr,0,arr.length-1);

        System.out.println("\nAfter Sorting: ");
        for (int num: arr){
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int i = low - 1;
        int pivot = arr[high];

        for (int j=low; j<high; j++){
            if (arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        System.out.println();
        for (int num: arr){
            System.out.print(num + " ");
        }
        return i+1;
    }
}
