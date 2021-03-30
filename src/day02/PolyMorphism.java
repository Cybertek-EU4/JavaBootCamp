package day02;

import java.util.*;

public class PolyMorphism {

    public static void main(String[] args) {

        Car car1 = new Toyota("Camry", "Black", 20000);
        Car mercedes = new Mercedes("AMG", "Black", 60000);
        Car bmw = new BMW("X7", "Red", 75000);

        System.out.println("----------------------------------------------------");

        List<Integer> list = new Stack<>() ;  // Upcasting (implicitly done): casting smaller type to large
        list.addAll(Arrays.asList(1,2,3,4,5));

     //   list.pop(); //5  // reference type decides what can be accessible

        ( (Stack)list ).pop();  // down casting ==> cating larger type to smaller

        System.out.println(list);

        System.out.println("------------------------------------------------");

        List<Integer> list2 =  new ArrayList<>(Arrays.asList(1,2,3,4,5));
       // ( (Stack)list2 ).pop();

        System.out.println(list2);

        System.out.println("------------------------------------------------");

        Vector<Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6));

     // Stack<Integer> stack = (Stack<Integer>) list3;
    //    stack.pop();
    //    System.out.println(stack);







    }

}
