
package testclassfornestedclasses;
//Imp: This is Member Inner Class -Also known as Regular Inner Class.
public class Outer {
    private String greeting="Hello to the world of Core-Java.";
    protected String field1="We can call protected fields from inner clas";
    public static String field2="We can call static fields from iner class";
    private int x=10;   // we can use samilar name fields in Inner classes as well.
    
        public class Inner{ // Inner class can be final/public /protected/private/static-in this non-static fields cant be axcessed.
            private int x=20;
            public int repeat=1;
                public void go(){
                    for(int i=0;i< repeat ;i++){
                        System.out.println(greeting);
                        System.out.println(field1);
                        System.out.println(field2);
                    }
                }
                public class NestedInner{
                    public void callNestedInner(){
                        System.out.println(Inner.this.x);// as this is nested we can asses directly the Inner fields.
                        System.out.println("I- am Nested Inner");
                    }
                }
        }
        public void callInner(){
            Inner inner=new Inner();
            inner.go();
        }
        public class Inner2{
            private int x=30;
            public void allTheX(){
                System.out.println(x);
                System.out.println(this.x);
                System.out.println(Outer.this.x);
                // System.out.println(Inner.this.x);//will not compile
                //we cant call the members of Inner here as they are not accesible outside the class.
                 Inner inner1=new Inner();
                 System.out.println(inner1.x);
            }
        }
}
