class A{
   void test(){
   	System.out.println("I'm from A class");
   }
}
class B extends A{
//void test(){System.out.println("I'm from B class");}
}
  
public class C extends B{
  
static int x = 0; 
 
public static void main(String[] args) {
C m = new C();
                m.go();
        }
        void go(){super.test();}
}


//Answer : f. It is not possible to invoke test() method defined in C from a method in A.

//Learnt these concepts
//Out puts : I'm from A class
//Inheritance  class B which is derived from A class we can access the test() from A class
//In a C class if i extend B class it will check the B class method and it will display "I'm from B class"
//Overriding : If i comment B class method then i extend B from A it will call the A class method by using super method.

