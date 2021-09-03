
/**
 * Author:
 * Description:  Basic input and output 
 * Fork the project and then change the code below to create your own program
 */

import java.util.Random; //just an example - this program doesn't have random nums

public class Main {

  Console c = new Console();//always leave this line in your program
  
  public Main() {
    
    String name = c.input("Please enter your name: ");
    c.print("Hello " + name + "\n");

    int myInt = c.inputInt("Please enter an integer: ");
    c.println("Your integer was: " + myInt);

    double myDouble = c.inputDouble("Please enter a real number (with decimal point):");
    c.println("Your double was: " + myDouble);

    int myChar = c.inputChar("Please enter a single character: ");
    c.println("Your character was: " + myChar);

  }

  public static void main(String[] args) {
   new Main();
  }

}
