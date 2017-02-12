 
/*What is the output of the following program?

The output is 

Parent
Derived
Derived*/

package main5;
 
class Parent {

public void display() 
{

 System.out.println("Parent");}

}


class Child extends Parent {
 public void display() {

System.out.println("Derived");}

}


class Main5{

public static void doDisplay( Parent o )
 {

o.display();
}

  
 public static void main(String[] args) {
  
   Parent x = new Parent();
   
   Parent y = new Child();
     
   Child z = new Child();
     
   doDisplay(x);
    
    doDisplay(y);
     
   doDisplay(z);
    }

}

