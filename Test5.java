/*
 What is the out of the following proram?
 The output is 
In String
 */
package test5;

public class Test5 {
  
 public static void test(String s)
    {
        System.out.println("In String");
    }
 
   public static void test(Object o) {
        System.out.println("In Object");
    }

  
  public static void main(String args[]) {
        test(null);
    }
}