import java.io.*;
import java.util.Arrays;


public class elemeSorusu2 {
    static int[] reversed_arr(int[] array) {
       int[] new_array = new int[array.length];
       for(int i = array.length - 1, j = 0; i >= 0; i--,j++){
            new_array[j] = array[i];
       }
       return new_array;
    }

public static void main(String[] args){ 
    int[] arr = {1,2,3,4,5};
    System.out.println(Arrays.toString(reversed_arr(arr)));
}
}