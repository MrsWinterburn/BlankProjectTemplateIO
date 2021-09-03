import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Adapted by R. Winterburn for use at GCSE
 * 
 * Class for use in AQA COMP1 exams for students using Java.
 *
 * write and writeLine are the exact equivalents of print and println.
 *
 * readChar and readByte use readLine and just take the first character
 * entered, which is converted into a char or a byte.
 *
 * readInteger uses readLine and converts the line into an integer. If this is
 * not possible then Integer.MIN_VALUE is returned as an indicator that it
 * has failed, an error message is also printed to the console.
 */
public class Console {

  public Console() {
  }// end of constructor AQAConsole2014
  //returns the first character of a line typed in.

  /**
   * Read a char from the console. There is no prompt.
   * @return the first char, after return key is pressed, from the console.
   */
  public char readChar() {
    return readChar("");
  } // end method readChar

  /**
   * Read a char from the console. There is a string prompt.
   * @return the first char, after return key is pressed, from the console.
   */
  public char readChar(String prompt) {
    return readLine(prompt).charAt(0);
  } // end method readChar

  /**
   * Read a byte from the console. There is no prompt.
   * @return the first byte, after return key is pressed, from the console.
   */
  public byte readByte() {
    return readByte("");
  } // end method readByte

  /**
   * Read a byte from the console. There is a string prompt.
   * @return the first byte, after return key is pressed, from the console.
   */
  public byte readByte(String prompt) {
    try {

      return Byte.parseByte(readLine(prompt).substring(0, 1));

    } catch (NumberFormatException nfe) {
      println(nfe.toString() + "Parsing a Byte");
    } catch (Exception e) {
      println("another exception" + e.toString());
    } // end try/catch
    return -1;
  } // end method readByte

  /**
   *
   * @return  the line entered from the console as a string
   */
  public String readLine() {

    return readLine("");

  } // end method readLine with no parameter

  /**
   * The parameter prompt is output to the console and the response, ended
   * with the return key, is returned.
   * If there is an exception then a message is written to the console and
   * an empty string is returned.
   * @param prompt the string to be output on the console
   * @return       the response as a string
   */
   public String readLine(String prompt) {
    String input = "";
    print(prompt);
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    try {

      input = br.readLine();

    } catch (IOException ioe) {
      println("IO Error reading from command line.");
    } // end try/catch
    return input;
  } // end method readLine

  /**
   * The parameter is output to the console and the response is converted
   * to an integer and returned
   * @param prompt    the output to the console
   * @return          the response is converted to an integer before it
   *                  is returned. If there is an error then the minimum
   *                  value an int can have is returned.
   */
   public int readInteger(String prompt) {
    try {

      return (int) Integer.parseInt(readLine(prompt));

    } catch (NumberFormatException nfe) {
      println("Not an integer entered.");
    } // end try/catch
    return Integer.MIN_VALUE;
  } // end method readInteger

  /**
   * The parameter is output to the console and the response is converted
   * to a Double and returned
   * 
   * By RJW
   * 
   * @param prompt    the output to the console
   * @return          the response is converted to a Double before it
   *                  is returned. If there is an error then the minimum
   *                  value a Double can have is returned.
   */
  public Double readDouble(String prompt) {
      
    try {
      return Double.parseDouble(readLine(prompt));
    } catch (NumberFormatException nfe) {
      println("Not a number entered.");
    } // end try/catch
    return Double.MIN_VALUE;
  } // end method readDouble 
  
  
  /**
   * Read a char from the console. There is no prompt.
   * @return the first char, after return key is pressed, from the console.
   */
  public char inputChar() {
    return readChar("");
  } // end method readChar

  /**
   * Read a char from the console. There is a string prompt.
   * @return the first char, after return key is pressed, from the console.
   */
  public char inputChar(String prompt) {
    return readLine(prompt).charAt(0);
  } // end method readChar

  /**
   * Read a byte from the console. There is no prompt.
   * @return the first byte, after return key is pressed, from the console.
   */
  public byte inputByte() {
    return readByte("");
  } // end method readByte

  /**
   * Read a byte from the console. There is a string prompt.
   * @return the first byte, after return key is pressed, from the console.
   */
  public byte inputByte(String prompt) {
    try {

      return Byte.parseByte(readLine(prompt).substring(0, 1));

    } catch (NumberFormatException nfe) {
      println(nfe.toString() + "Parsing a Byte");
    } catch (Exception e) {
      println("another exception" + e.toString());
    } // end try/catch
    return -1;
  } // end method readByte

  /**
   *
   * @return  the line entered from the console as a string
   */
  public String input() {

    return readLine("");

  } // end method readLine with no parameter

  /**
   * The parameter prompt is output to the console and the response, ended
   * with the return key, is returned.
   * If there is an exception then a message is written to the console and
   * an empty string is returned.
   * @param prompt the string to be output on the console
   * @return       the response as a string
   */
   public String input(String prompt) {
    String inputStr = "";
    print(prompt);
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    try {

      inputStr = br.readLine();

    } catch (IOException ioe) {
      println("IO Error reading from command line.");
    } // end try/catch
    return inputStr;
  } // end method readLine

  /**
   * The parameter is output to the console and the response is converted
   * to an integer and returned
   * @param prompt    the output to the console
   * @return          the response is converted to an integer before it
   *                  is returned. If there is an error then the minimum
   *                  value an int can have is returned.
   */
   public int inputInt(String prompt) {
    try {

      return (int) Integer.parseInt(readLine(prompt));

    } catch (NumberFormatException nfe) {
      println("Not an integer entered.");
    } // end try/catch
    return Integer.MIN_VALUE;
  } // end method readInteger

  /**
   * The parameter is output to the console and the response is converted
   * to a Double and returned
   * 
   * By RJW
   * 
   * @param prompt    the output to the console
   * @return          the response is converted to a Double before it
   *                  is returned. If there is an error then the minimum
   *                  value a Double can have is returned.
   */
  public Double inputDouble(String prompt) {
      
    try {
      return Double.parseDouble(readLine(prompt));
    } catch (NumberFormatException nfe) {
      println("Not a number entered.");
    } // end try/catch
    return Double.MIN_VALUE;
  } // end method readDouble 

  /**
   * The parameter is printed to the console
   * @param o   the object to be printed to the console.
   */
   public void print(Object o) {
    String output = String.valueOf(o);
    System.out.print(output);
  } // end method print

  /**
   * A new line character is output to the console.
   */
   public void println() {
    println("");
  } // end method println with no parameter

  /**
   * The parameter is printed to the console followed by a new line character
   * @param o   the object to be printed to the console.
   */
   public void println(Object o) {
    String output = String.valueOf(o);
    System.out.println(output);
  } // end method println

  /**
   * The parameter is printed to the console
   * @param o   the object to be printed to the console.
   */
   public void write(Object o) {
    print(o);
  } // end method write

  /**
   * A new line character is output to the console.
   */
   public void writeLine() {
    println();
  } // end method writeLine with no parameter

  /**
   * The parameter is printed to the console followed by a new line character
   * @param o   the object to be printed to the console.
   */
   public void writeLine(Object o) {
    println(o);
  } // end method writeLine

  /**
   * printf is used to output args in the format given.
   * See public PrintStream printf(...)
   * @param format  the format for the output
   * @param args
   */public void printf(String format, Object args) {
    System.out.printf(format, args);
  } // end method printf

} // end class AQAConsole2014
