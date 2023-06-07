package June06;

public class ArrayRotation {

    public int[] rotateArray(int[] arr, int pos){
        int n = arr.length;
        int[] temp = new int[n];
        for(int i=pos; i<n; i++){
            temp[i-pos] = arr[i];
        }
        for (int j=0; j<pos; j++){
            temp[n-pos+j] = arr[j];
        }
        return temp;
    }

}
