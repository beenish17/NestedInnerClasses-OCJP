
package testclassfornestedclasses;

public class LocalMethodOuter {
    public int length=5;
    private String field="valid";
    static String field1="valid static";

        public void calculate(){
           final int width=20;// variables with-in the method should be final or effectively final . which means they should not be re-declared
        //again.if i write it like this width=30; and then change this value on any line again i.e width=40; it is not effectivly final.
                class Inner3{ // we can not use any modifiers with local class axcept "final".
                    public void multiply(){
                        System.out.println(length * width);
                        System.out.println(field);
                        System.out.println(width);
                    }
                }
                //width=30 ; Not possible .variables used in Inner Method Class should be effectively final.
                Inner3 a=new Inner3();
                a.multiply();
                
                
        }
        
}
