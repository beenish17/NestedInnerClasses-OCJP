
package testclassfornestedclasses;

public class TestClassForNestedClasses {

    public static void main(String[] args) {
        //1: we are calling the method of Inner Class.
        Outer outer=new Outer();
        outer.callInner();
        System.out.println("----------------------");
        //2: This is second way to call the method of InnerClass.
        Outer secondWay=new Outer();
        Outer.Inner secondWayCall=secondWay.new Inner();
        secondWayCall.go();
        System.out.println("----------------------");
        //3: we can shorten the second method as below,and is the simplest way ;
        new Outer().new Inner().go();
        System.out.println("----------------------");
        //4: call to NestedClass method.
        new Outer().new Inner2().allTheX();
        new Outer().new Inner().new NestedInner().callNestedInner();
        System.out.println("-------------------------");
        //5: call to NestedClass method through second method.
        Outer o=new Outer();
        Outer.Inner o1=o.new Inner();
        Outer.Inner.NestedInner d=o1.new NestedInner();
        d.callNestedInner();
        
        System.out.println("-----Local Method classes---------");
        LocalMethodOuter call=new LocalMethodOuter();
        call.calculate();
        
        System.out.println("------Anonymass class------");
        //AnonymasInner d=new AnonymasInner();
        System.out.println(new AnonymasInner().pay());
        System.out.println(new AnonymasInner().pay1());
        System.out.println("-------Nested Static Class---");
        
        StaticClassEnclosing a1=new StaticClassEnclosing();
        StaticClassEnclosing.Nested1.method2(); // to call static methods we have to give a direct call.
        new StaticClassEnclosing.Nested1().instanceMethod(); // we need to creat an object to call an instance method.
       
    }
    
}
