package app;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        int[] arr = new int[10];

        for(int i=0; i<arr.length; i++){
            arr[i] = (int) Math.floor(Math.random() * arr.length + 1);
        }

        System.out.println(Arrays.toString(arr));
        
        int index = Search.findLin(arr, 4);
        System.out.println(index);
        
    }
}