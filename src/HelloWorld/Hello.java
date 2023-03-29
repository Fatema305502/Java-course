package HelloWorld;

import java.util.function.BinaryOperator;

public class Hello
{
  public static void main(String[] args)
  {
    System.out.println("HelloWorld.Hello, Tim");
    boolean isAlien = false;
    System.out.println("It is not an alien");
    System.out.println("And i am scared of aliens");
    int topScore =80;
    System.out.println("You got the high score");
    int secondTopScore =95;

    int newValue= 50;
    System.out.println("This is an error ");
    boolean isCar =false;

    String makeOfCar ="Volkswagen";

    //use ternary operator means (3 part )
    // we have 3 operands
    boolean isDomestic = false;

    String s= "This car is not domestic";
    System.out.println(s);


    int ageOfClient= 20;
    String ageText= "Over Eighteen ";
    System.out.println("Our client is " + ageText);
    /*
    //use ternary operator means (3 part )
    * Operand one (ageOfClient >=18 ) in this case is the condition we are checking .
    *  it needs to return true or false
    *
    * operand two (over eighteen) here is the value to assignn to the variable ageText
    * if the condition above is true
    *
    * operand three (Still a kid ) here is the value to assign to the variable ageText
    * if the condition above is false   */


    double one =20.00d;
    double second= 80.00d;
    double sum=(one +second) *100.00d ;

    System.out.println("The sum of one and second is " + sum );
    double remainder =sum %40.00d;
    System.out.println( "The remainder is " + remainder);

    boolean isNoRemainder =(remainder == 0)? true : false;
    System.out.println("isNoRemainder = " + isNoRemainder);

    if (!isNoRemainder ){
      System.out.println("Got some remainder ");
    }



  }
}
