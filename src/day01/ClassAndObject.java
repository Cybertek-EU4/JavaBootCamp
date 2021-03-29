package day01;

class Person{

    public String name, gender;
    public static boolean isHuman =true;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name+" "+gender;
    }
}



public class ClassAndObject {

    public static void main(String[] args) {
        Person person1 = new Person("Daniel", "Male");  // Daniel
        Person person2 = new Person("Conor", "Male");  // Conor
        Person person3 = new Person("Breanna", "Female");  // Breanna

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

    }

}



class Test{

    int a; // 0
    static int b; // 0

    public static void main(String[] args) {

        Test test1 = new Test();
        test1.b = 10;
        test1.a = 100;

        Test test2 = new Test();
        test2.b = 20;
        test2.a = 200;


        System.out.println(test1.b); // 20
        System.out.println(test2.b); // 20

        System.out.println(test1.a);
        System.out.println(test2.a);



    }




}