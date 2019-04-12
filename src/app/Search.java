package app;

import java.util.stream.IntStream;
import java.util.NoSuchElementException;


public class Search {

    private static LinearSearch linearSearch = (intArr, intSearch) -> {
        try {
            return IntStream
                    .range(0, intArr.length)
                    .filter(i -> intArr[i] == intSearch)
                    .findFirst()
                    .getAsInt();
        } catch (NoSuchElementException e) {
            return -1;
        }
    };


    public static int findLin(int[] arr, int searchInt) {
        return linearSearch.search(arr, searchInt);
    }

   

}