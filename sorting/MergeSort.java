import java.util.*;

public class MergeSort{
    
    public int[] intToArray(ArrayList<Integer> array){
        int[] result = new int[array.size()];
        for (int i = 0; i < array.size(); i++){
            result[i] = array.get(i);
        }
        return result;
    }

    public int[] slice(int[] array, int start, int end){
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = start; i < end; i++){
            al.add(array[i]);
        }
        return intToArray(al);
    }

    public int[] slice(int[] array, int start){
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = start; i < array.length; i++){
            al.add(array[i]);
        }
        return intToArray(al);
    }

    public int[] merge(int[] array1, int[] array2){
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0;
        int j = 0;
        while ((i < array1.length) && (j < array2.length)){
            if (array1[i] < array2[j]){
                al.add(array1[i]);
                i++;
            }
            else {
                al.add(array2[j]);
                j++;
            }
        }
        while (i < array1.length){
            al.add(array1[i]);
            i++;
        }
        while (j < array2.length){
            al.add(array2[j]);
            j++;
        }
        return intToArray(al);
    }

    public int[] mergeSort(int[] array){
        if (array.length <= 1) return array;
        int mid = array.length/2;
        int[] left = mergeSort(slice(array, 0, mid));
        int[] right = mergeSort(slice(array, mid));
        return merge(left, right);        
    }

    public static void main(String[] args){
        MergeSort srt = new MergeSort();
        int[] ar1 = {78, 45, 123, 67, 11, 3, 5, 1};
        //int[] ar2 = {1, 3, 7, 9};
        System.out.println(Arrays.toString(srt.mergeSort(ar1)));
    }
}