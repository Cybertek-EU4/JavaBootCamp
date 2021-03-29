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
