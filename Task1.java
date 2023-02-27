// Реализовать алгоритм сортировки слиянием.

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] array = {1,3,2,5,6};
        System.out.println(Arrays.toString(array));
        margeSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void margeSort(int[] array) {
        int lenght = array.length;
        if(lenght <= 1) return;

        int middle =  lenght / 2;
        int[] leftArray = new int[middle]; 
        int[] rightArray = new int[lenght - middle]; 

        int j = 0;

        for (int i = 0; i < lenght; i++) {
            if(i < middle){
                leftArray[i] = array[i];
            }
            else{
                rightArray[j] = array[i];
                j++;    
            }
        }

        margeSort(leftArray);
        margeSort(rightArray);
        marge(leftArray, rightArray, array);
    }

    public static void marge(int[] leftarray, int[] rightarray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, left = 0, right = 0;

        while (left < leftSize && right < rightSize) {
            if (leftarray[left] < rightarray[right]) {
                array[i] = leftarray[left];
                i++;
                left++;
            }
            else{
                array[i] = rightarray[right];
                i++;
                right++;
            }
        }
        while (left < leftSize) {
            array[i] = leftarray[left];
            i++;
            left++;
        }
        while (right < rightSize) {
            array[i] = rightarray[right];
            i++;
            right++;
        }
    }
}