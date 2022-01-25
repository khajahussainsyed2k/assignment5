package com.company;

class Class1 {
   private int a;
   private char ch;

    public void printVariables() {
        System.out.println(a + " " + ch);
    }
    public void localVarible(){
        int var;
        char character;
        //System.out.println(var + " " + character);
        //Local variables must be initialized before use,
        // as they don't have a default value and the compiler won't let us use
        // an uninitialized value
    }

}
class Class2{
    String s;
    public static Class2 stringMethod(String s1){
        //s=s1;
        //static method can only access static data members
        Class2 obj=new Class2();
        return obj;
    }
    public void method2(String s2){
        s=s2;
        System.out.println(s);
    }
}
public class DriverClass{
    public static void main(String[] args) {
	// write your code here
        Class1 object1=new Class1();
        object1.printVariables();
        object1.localVarible();

        Class2 object2=Class2.stringMethod("jj");

        object2.method2("hello");
    }
}
