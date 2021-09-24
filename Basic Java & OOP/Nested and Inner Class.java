/* 
    -------------------------------[ Nested Class ]-------------------------------
    - It is possible to define a class within another class; such classes are
      known as nested classes.
    - The scope of a nested class is bounded by the scope of its enclosing classes
    - A nested class has access to the members, including private members, of the
      class in which it is nested.
    - There are two types of nested class: (i) static, (ii) non-static


    ----------------------------[ Static Nested Class ]---------------------------
    - A static nested class is the one that has the static modifier applied
    - It must access the non-static members of its enclosing class through an
      object. That is, it cannot refer to non-static members of enclosing class directly.
    - Because of this restriction, static nested classes are seldom used.


    --------------------------[ Non-static Nested Class ]-------------------------
    --------------------------------[ Inner Class ]-------------------------------
    - An inner class is a non-static nested class.
    - It has access to all of the variables and methods of its outer class and may refer to them directly in the same way that other non-static members of the outer class do.
    - The outer class can access the variables and methods of the inner class by creating an object of the inner class.

    
    -------------------------------------N.B.-------------------------------------
    class outer {
        //.....
        class inner {
            //....
            class nestedInner {
                //....
            }
        }
    }
    1. "outer" class can create an object of "inner" class, but no of "nestedInner" class.
    2. Any class can create an object of any of its ancestor classes and of its sibling classes.

*/

class Outer {
    int outer_x = 100;
    private int outer_y = 500;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println( "Display: outer_x = " + outer_x );
            System.out.println( "Display: outer_y = " + outer_y );
        }

        class InnerInner {
            int innerinner_x = 50;
            void innerinner_display() {
                System.out.println("innerinner_x = " + innerinner_x);
            }
            void outer_Display() {
                System.out.println( "Display: outer_x: " + outer_x );
            }
        }
    }
}

public class NestedAndInnnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
