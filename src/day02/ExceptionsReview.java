package day02;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;


class BreakTimeException extends RuntimeException{  // custom unchecked

    public BreakTimeException(String message) {
        super(message);
    }

}

class BreakForLunchException extends Exception{  // custom checked exception

}


public class ExceptionsReview {


    public static void main(String[] args) throws BreakForLunchException {

        System.out.println("Test Started");

        // int a = 100/0;  // unchecked

     //   new FileInputStream(""); // checked

     //   Thread.sleep(3000);  // checked

        method1();
      //  method2();

     //   throw new BreakTimeException("It's break time");

    //    throw new BreakForLunchException();

        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("Catch Block");
            System.exit(0);  // to prevent finally block from being executed
        }finally {
            System.out.println("Finally block");
        }


       System.out.println("Test Ended");



    }


    public static void method1(){
        try {
            throw new IOException();
        }catch (IOException e){

        }

    }

    public static void method2() throws IOException{
            throw new IOException();

    }



}
