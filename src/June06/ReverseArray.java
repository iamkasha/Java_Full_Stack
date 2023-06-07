package June06;

import java.util.Arrays;

public class ReverseArray {
    public int[] arrayReverse(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];

        for(int i=0;i<n;i++){
            temp[i] = arr[n-i-1];
        }
        return temp;
    }

}
