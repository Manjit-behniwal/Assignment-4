/*
what is the output of the following program?

The output is
Error
foo() in Child cannot override foo() in SuperClass
void foo() {} attempting to assign weaker access privileges; was protected
 */
package test6;
class SuperClass {
    protected void foo() {}
}

class Child extends SuperClass {
    void foo() {}
}

public class Test6 {
    public static void main(String args[]) {
        Child child = new Child();
  
      child.foo();
    }
}
