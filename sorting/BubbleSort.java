import java.util.*;

public class BubbleSort{
    public int[] sort(int[] array){
        for (int i = array.length; i > 0; i--){
            for (int j = 0; j < i-1; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args){
        BubbleSort srt = new BubbleSort();
        int[] ar1 = {10, 5, 2, 8, 15, 3};
        System.out.println("Sorted array: " + Arrays.toString(srt.sort(ar1)));
    }
}