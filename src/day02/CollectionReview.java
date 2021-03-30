package day02;

import java.util.*;

public class CollectionReview {

    public static void main(String[] args) {

        Set<Integer> st1 =new HashSet<>();
        st1.addAll(Arrays.asList(10, 1, 2, 3, 4, 7, 8, 9, 16, null));

        Set<Integer> st2 = new LinkedHashSet<>();
        st2.addAll(Arrays.asList(10, 1, 2, 3, 4, 7, 8, 9, 16, null));

        Set<Integer> st3 = new TreeSet<>();
        st3.addAll(Arrays.asList(10, 1, 2, 3, 4, 7, 8, 9, 16));


        System.out.println("st1 = " + st1);
        System.out.println("st2 = " + st2);
        System.out.println("st3 = " + st3);

        System.out.println("------------------------------------------");

        Queue<Integer> q1 = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));  // FIFO

        q1.poll();  // 1

        System.out.println("q1 = " + q1);


    }
}
