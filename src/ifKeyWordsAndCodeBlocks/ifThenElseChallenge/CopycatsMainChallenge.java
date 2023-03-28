package ifKeyWordsAndCodeBlocks.ifThenElseChallenge;

public class CopycatsMainChallenge
{
  public static void main(String[] args)
  {
    boolean gameOver = true;
    int score = 10000;
    int levelCompleted = 8;
    int bonus = 200;
    int finalScore = score;

    calculateScore(true,800,levelCompleted,bonus);

  }

  public static void calculateScore( boolean gameOver,int score, int levelCompleted, int bonus)
  {
    int finalScore = score;
    if (gameOver)
    {

      //finalScore= finalSore+ (levelCompleted * bonus)
      finalScore += (levelCompleted * bonus);
      System.out.println("your final score was " + finalScore);

    }
  }
}
