package MethodOverloading;

/**
 * Create a method called getDurationString with 2 parameters (minutes and seconds)
 * Validate that minutes >= 0
 * validate that seconds >= 0 && seconds <= 59
 * The method should return "Invalid value" if either of the above are not true
 * If the parameters are valid then calculate how many hours, minutes and seconds equal the minutes and
 * seconds passed to the method and return that value as a string in format "XXh YYm ZZs" where XX represents
 * number of hours, YY the minutes and ZZ the seconds.
 * Create a 2nd method of the same name but with only one parameter (second)
 * Validate that second >= 0
 * If it is valid calculate how many minutes are in the seconds value and then call the other overloaded method
 * passing the correct minutes and seconds calculated, so it can calculate correctly.
 * BONUS:
 * For the input 61 minutes output should be 01h 01m 00s
 */

public class SecondsAndMinutesChallenge
{
  public static void main(String[] args)
  {
    System.out.println(getDurationString(3945));//this is the first test case
    System.out.println(getDurationString(65,45));//this is the second test case
  }

  public static String getDurationString(int seconds)
  {
    //two step approach to get hours
    int minutes= seconds/60;
    //return getDurationString(minutes,seconds);
    int hours=minutes/60;

    System.out.println("hours = " +hours);

    /*one step approach to get hours
    int hours1=seconds /3600;
    System.out.println("hours1 = " +hours1);*/


//we taking the minutes variable and using the remainder operator on it with 60. when we divided by 60 , we got the number of hours
    int remainingMinutes =minutes % 60;
    System.out.println("minutes = " +minutes);
    System.out.println("remainingMinutes = " + remainingMinutes);


    int remainingSeconds= seconds % 60;
    System.out.println("remainingSeconds = " + remainingSeconds);


    return hours + "h " + remainingMinutes + "m" + remainingSeconds + "s";
  }

  public static String getDurationString(int minutes, int seconds)
  {
    //int minutes= seconds/60;
    int hours=minutes/60;
    int remainingMinutes =minutes % 60;
    int remainingSeconds= seconds % 60;

    return hours + "h " + remainingMinutes + "m" + remainingSeconds + "s";

  }
}
