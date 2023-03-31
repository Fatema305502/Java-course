package MethodOverloading;

public class OverloadedChallenge
{
  public static void main(String[] args)
  {
    System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
    System.out.println("68in = " + convertToCentimeters(68) + "cm");
  }

  public static double convertToCentimeters(int inches)
  {
    //1 inch= 2.54 cm
    return inches * 2.54;
  }

  public static double convertToCentimeters(int feet, int inches)
  {
    //one feet =12 inches
    /*we multipy feet by 12 to convert feet to inches, and
      then we add that number to the inches value passed
    * in on the method  */
    return ((feet * 12 )+ inches) *2.54;
  }
}
