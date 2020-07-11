import java.io.*;
import java.util.*;
public class SelectionSort {
    public void SeltSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }


            }


        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        int[] a = {12,34,67,12,78,89,23,6,7};
        System.out.println("array:");
        System.out.println(Arrays.toString(a));
        System.out.println("sorted array:");
        obj.SeltSort(a);
    }
}
