/* 
    --------------------------[Variable Length Arguments]-------------------------
    ----------------------------------[Varargs]-----------------------------------
    - A method that takes a variable number of arguments is called a "variable-arity" method, or simply a "varargs" method.
    - We could do it in two ways :
        i.  If the maximum number of arguments is small, then method overloading is a solution.
        ii. If the maximum number of arguments is larger, then we can pass an array which is another solution.
    - But now it can be done in another way:
        * A variable-length argument is specifies by three periods (...). For example, 
        static void vaTest( int ... v ){
            //code-lines...
        }
    
    - A method can have "normal" parameters along with a variable-length parameter. However. the variable-length parameter must be the last parameter. For example, this method declaration is perfectly acceptable:
    int doIt( int a, int b, double c, int ... vals ) {
        // code-lines...
    }
    - There must be only one varargs parameter in a method.
    - varargs methods can be overloaded
    - a varargs method can also be pverloaded by a non-varargs methos.
*/

public class varargs {
    static void vaTest ( int ... v ) {
        System.out.print( "Number of args: " + v.length + ", Contents: " );
        for( int x : v ) System.out.print( x + " " );
        System.out.println();
    }
    static void vaTest( boolean ... v ) {
        System.out.print("vaTest (boolean ...) " + "Number of args: " + v.length + ", Contents: ");
        for( boolean x : v ) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static void vaTest( String msg, int ... v ) {
        System.out.print( msg + v.length + ", Contents: " );
        for( int x : v ) System.out.print( x + " " );
        System.out.println();
    }
    static void vaTest ( int v ) {
        System.out.println("Non-varargs method: " + v);
    }
    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 2, 3);
        //vaTest(); // this will work only when the method is not overloaded. this error is calle "Ambiguity"

        vaTest("One vararg: ", 10);
        vaTest("Three varargs: ", 1, 2, 3);
        vaTest("No varargs: ");

        vaTest( true, false, false, true, true, true, false );
    }
}
