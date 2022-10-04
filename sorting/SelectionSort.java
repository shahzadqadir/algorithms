import java.util.*;

public class SelectionSort {
    public int getMinIndex(int[] array, int frm){
        int minIndex = frm;
        for (int i = frm+1; i < array.length; i++){
            if (array[i] < array[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }

    public int[] sort(int[] array){
        for (int i = 0; i < array.length; i++){
            int minIndex = getMinIndex(array, i);
            if (array[i] > array[minIndex]){
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        return array;
    }

    public static void main(String[] args){
        int[] ar1 = {2, 1, 8, 7, 10};
        SelectionSort srt = new SelectionSort();
        System.out.println("original array: " + Arrays.toString(ar1));
        System.out.println("sorted with selection sort: " + Arrays.toString(srt.sort(ar1)));
    }
}
