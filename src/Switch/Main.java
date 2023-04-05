package Switch;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main
{

  public static void main(String[] args)
  {
    int switchValue=3;
    switch (switchValue)
    {
      case 1 -> System.out.println("Value was 1");
      case 2 -> System.out.println("Value was 2");
      case 3, 4, 5 -> {
        System.out.println("Was a 3 , a4 ,or a 5 ");
        System.out.println("Actually it was a  " + switchValue);
      }
      default -> System.out.println("Was not 1, 2, 3, 4 , or 5");
    }
    String month ="OCTOBER";
    System.out.println(month + " is in the  " + getQuarter(month) + " quarter" );
  }
  //this method will receive a month of the year, and then it should return a String
  public static String getQuarter(String month){
    // we don't use break but we use return
    return switch (month)
        {
          case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
          case "APRIL", "MAY", "JUNE" -> "2nd";
          case "July", "AUGUST", "SEPTEMBER" -> "3rd";
          case "OCTOBER", "NOVEMBER", "December" -> "4th";
          default -> " bad";
        };
  }



}
