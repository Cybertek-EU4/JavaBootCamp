package day01;

public class CharSequencesReview {

    public static void main(String[] args) {

        String string1 = "Cybertek";  // String literal
        String string3 = "Cybertek";
        String string4 = "Cybertek";
        String string5 = "Cybertek";


        String string2 = new String("Cybertek");
        String string6 = new String("Cybertek");
        String string7 = new String("Cybertek");

        string1 = string1.concat(" School");  // new object: "Cybertek School"
        string2 =  string2.concat(" School"); // new object: "Cybertek School"

        System.out.println(string1);
        System.out.println(string2);

        System.out.println("==================================================");

        StringBuilder stringBuilder = new StringBuilder("Cybertek");
        stringBuilder.append(" School");
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer("Cybertek");  // synchronized
            stringBuffer.append(" School");
        System.out.println(stringBuffer);




    }
}
