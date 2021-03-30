package day02;

interface A{

}

interface B{

}

interface C extends A, B{

}

class D{

}

public class MultiInheritance extends D  implements A, B, C{


}
