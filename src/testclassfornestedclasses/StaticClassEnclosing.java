
package testclassfornestedclasses;

public class StaticClassEnclosing {
        static class Nested1{
            private int price=6;
            public static void method2(){System.out.println("Static method");}
            public void instanceMethod(){System.out.println("I am instance method");}
        }
    public void method(){
        Nested1 v=new Nested1();
        v.method2();
    }
}
