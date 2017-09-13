
package testclassfornestedclasses;

public class AnonymasInner {
    // anonymas classses are just like Local method classes.but the difference is we can extend an inner class and implements an Interface at
    //  a same time but in Anonymas class we can just do one at a time.
    abstract class SalesToday{
        abstract int dollarsOff();
    }
    interface canAlsoBeApplied{
        int price();
    }
        public int admission(int basePrice){    // applying abstract class
            SalesToday s=new SalesToday(){
                int dollarsOff(){return 3;}
            };
        return basePrice - s.dollarsOff();
        }
        public int applyInterface(int a){   // applying Interface.
            canAlsoBeApplied apply=new canAlsoBeApplied() {
                public int price(){return 5;}
            }; 
        return a+apply.price();
        }
    //Another way to apply the Anonymas class directly.
        public int admision(int basePrice,canAlsoBeApplied e ){
            return basePrice - e.price();
        }
        
        public int pay(){
            return admision(5, new canAlsoBeApplied(){
                public int price(){return 4;}
            });
        }
        class Inner{    // implementing a class 
            int method(){return 5;}
        }
        public int admission1(int bp, Inner w){
            return bp+ w.method();
        }
        public int pay1(){
            return admission1(2, new Inner(){
            public int method(){return 6;}
        });
        }
}
