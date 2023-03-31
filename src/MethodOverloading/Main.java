package MethodOverloading;
//overloading means the samme attribute with different signature
public class Main
{
  public static void main(String[] args)
  {
    calculateScore( "Tim",500);
    //we can have new one
    int newScore = calculateScore( "Tim",500);
    System.out.println("New Score is " +newScore);


    calculateScore(75);

  }
  public static int calculateScore(String playerName, int score){
    System.out.println("Player" + playerName + "score" + score +"points");

    //return something because we have int
    return score*1000;
  }


  public static int calculateScore( int score){
    System.out.println("Unnamed player scored " + score +"points");

    //return something because we have int
    return score*1000;
  }
}
