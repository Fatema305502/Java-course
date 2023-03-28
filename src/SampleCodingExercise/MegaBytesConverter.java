package SampleCodingExercise;

public class MegaBytesConverter
{
  public static void printMegaBytesAndKiloBytes( int kiloBytes){

    //Calculate megabytes and remaining kilobytes

    //if parameter is <0 print "invalid value"
    if (kiloBytes<0){

      System.out.println("Invalid Value");

    }

    else{

      //Calculate how many megabytes in kiloBytes
      //YY represents the original value megabytes
      int YY = (int)(kiloBytes / 1024);

      //Calculate how many kbRemaining in kiloBytes given
      //ZZ represents the calculated remaining kilobytes
      int ZZ = kiloBytes % 1024;

      //Just call kiloBytes XX instead
      //XX represents the original value kilobytes
      int XX = kiloBytes;

      String printMBKB = XX + " KB = " + YY + " MB and " + ZZ + " KB";

      //print "XX KB = YY MB AND ZZ KB"
      System.out.println(printMBKB);
    }
  }

  public static void main(String[] args){
    printMegaBytesAndKiloBytes(2500);
    printMegaBytesAndKiloBytes(0);
    printMegaBytesAndKiloBytes(394298);
  }
}
