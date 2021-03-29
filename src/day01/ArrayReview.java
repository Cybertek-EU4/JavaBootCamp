package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayReview {


    public static void main(String[] args) {

        int a = 10;

        int[] array = new int[2];  // size is fixed
        array[0] = 1;
        array[1] = 2;
    //    array[2] = 3;

        System.out.println(Arrays.toString(array) );


        Integer[] array2 = {1,2,3,4};

        int[][] array2D = { {}, {}  };  // multi-dimensional array


       // ArrayList<int> list = new ArrayList<int>();
        List<ArrayList<Integer>> list = new ArrayList<>(); // List of ArrayList

        System.out.println("===================================================");

        int[] numbers = {1,2,3,4,5};
                    //   0 1 2 3 4

    //    System.out.println( numbers[3]);

        for(int i = 0; i < numbers.length; i++  ){
            System.out.println(numbers[i]);
        }

        System.out.println("-----------------------------");

        for(int each : numbers){
            System.out.println(each);
        }



    }

}
