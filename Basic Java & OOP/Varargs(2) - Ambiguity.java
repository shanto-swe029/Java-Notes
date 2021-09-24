/* 
    ---------------------------[Varargs and Ambiguity]----------------------------
    - If we have two methods like:
        void vaTest( int ... v ) { // code-lines... }
        void vaTest( boolean ... v ) { // code-lines... }

        Now, the overloading of vaTest() is perfectly correct. However, the following call will make a compilation error:
        vaTest(); // Error: Ambiguous!

        Because the varargs parameter can be empty, this call could be transated into a call to "vaTest(int ...)" or "vaTest(boolean ...)". Both are equally valid. Thus, the call is inherently ambiguous.
    
    - Here is another example of ambuguity:
        The following overloaded versions of "vaTest()" are inherently ambigious even though one takes a normal parameter:
        void vaTest( int ... v ) { // code-lines... }
        void vaTest( int n, int ... v ) { // code-lines... }

        Although the parameter list of "vaTest()" differ, there is no way for the compiler to resolve the following call:
        vaTest(1);

        There is no way for the compiler to answer this question. Thus, the situation is ambigious.
*/

public class varargs_ambiguity {
    public static void main(String[] args) {
        
    }
}
