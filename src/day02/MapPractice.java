package day02;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        String[] namesGroup1 = {"Oliver", "Jack", "Noah", "Breanna", "Shay","James", "Conor", "Jake", "John"};
        Integer[] salariesGroup1 = {11000, 105000, 95000, 85000, 100000, 90000, 78000, 118000, 98000};

        LinkedHashMap<String, Integer> group1 = new LinkedHashMap<>();

        for(int i= 0; i < namesGroup1.length; i++){
            group1.put( namesGroup1[i], salariesGroup1[i]  );
        }
        System.out.println(group1);

        // iterate maps by keys:
        for (String each : group1.keySet()) {
            System.out.println(each);
        }

        System.out.println("------------------------------------------");
        // iterate maps by values
        for (Integer each : group1.values()) {
            System.out.println(each);
        }

        System.out.println("-------------------------------------------");
        // iterate maps by keys & values

           for( Map.Entry<String, Integer> each   : group1.entrySet()  ){
              // System.out.println(each);
               System.out.println(each.getKey()  + " : "+each.getValue());
           }

        System.out.println("---------------------------------------------------------");

           group1.keySet().forEach(  p -> {
               System.out.println(p);
           } );


        System.out.println("-------------------------------------------------------");

        group1.values().forEach( p -> {
            System.out.println(p);
        });


    }

}
