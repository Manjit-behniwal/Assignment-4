/*
what is the output of the following program?

The output is

 Error

 constructor Coordinate in class Coordinate cannot be applied to given types;
        Coordinate p = new Coordinate();
Actual and formal parameters are not matched.
 */
package main1;

class Coordinate {
    int x, y;

  
  public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main1 {
    public static void main(String args[]) {
        Coordinate p = new Coordinate();
   
     System.out.println("x = " + p.x + ", y = " + p.y);
    }
}
