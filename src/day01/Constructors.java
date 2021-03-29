package day01;



class Student{


    public String name, gender;
    public int age;

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        Student student1 = new Student("John", "Male", 25);
        student1.name = "Mohammed";

        System.out.println( student1 );

        Student student2 = new Student("Hava", "female", 24);

        System.out.println(student2);

        String str = "Hello";
       // String.split("");
        str.split("");


    }


}


public class Constructors {
        int a;

    public Constructors(){
        System.out.println("default");
    }

    public Constructors(int a){
        this();
        this.a = a;
        System.out.println("integer "+a);
    }

    public Constructors(String a){
        this();
    //    this(10);

    }



    public static void main(String[] args) {

        new Constructors().method1();
        new Constructors().method2();

       Constructors obj  = new Constructors();

        System.out.println("----------------------------------");
       obj.method2();
       obj.method1();

        System.out.println("---------------------------------------");

        new Constructors(10);

    }

    public void method1(){
        System.out.println("Hello");
    }

    public void method2(){
        System.out.println("How are you");
    }

}
