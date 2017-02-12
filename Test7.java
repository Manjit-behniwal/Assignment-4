/*
 * What is the out put of the following program?

The output is 

X=5

Latest parameter value passed to constructor will override the previous assigned value to variable x.

 */

package test7;

/public class Test7 {    
   
 int x = 2;
    
Test7(int i) 
{ x = i; 
} 
  
  public static void main(String[] args) 
{    
         Test7 t = new Test7 (5);
    
     System.out.println("x = " + t.x);
    }
}
