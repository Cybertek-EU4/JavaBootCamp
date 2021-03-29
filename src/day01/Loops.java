package day01;

/*
6. Loops: repeated actions
			for:
				for(initialization; Condition; Iterator){

				}


			while:
				while(Condition){

				}

 */

public class Loops {

    public static void main(String[] args) {

        for( int i =1 ;  i < 6 ; i++ ) {

            System.out.println("Hello");
        }

        System.out.println("========================================");

        String str = "Hello";
                    //01234

        String reversed = "";

        /*
        reversed += str.charAt( 4 );  //0
        reversed += str.charAt( 3 );
        reversed += str.charAt( 2 );
        reversed +=  str.charAt( 1 );
        reversed +=  str.charAt( 0 );

         */

    for(int i = str.length()-1; i >= 0; i-- ) {
        reversed += str.charAt(i);
    }




        System.out.println(reversed);



    }
}
