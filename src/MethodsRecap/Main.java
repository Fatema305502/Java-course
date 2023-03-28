package MethodsRecap;

public class Main
{
  public static void main(String[] args)
  {
    int playerPosition=calculateHighScorePosition(1500);
    displayHighScorePosition("Tim",playerPosition);


    playerPosition=calculateHighScorePosition(1000);
    displayHighScorePosition("Bob",playerPosition);


    playerPosition=calculateHighScorePosition(500);
    displayHighScorePosition("Fatema",playerPosition);


    playerPosition=calculateHighScorePosition(100);
    displayHighScorePosition("Mila",playerPosition);


     playerPosition=calculateHighScorePosition(25);
    displayHighScorePosition("Farhad",playerPosition);

  }

  public static void displayHighScorePosition(String playerName, int playerPosition)
  {
    System.out.println(
        playerName + " managed to get into position " + playerPosition + " on the high score list ");
  }

  public static int calculateHighScorePosition(int playerScore)
  {
    if (playerScore >= 1000)
    {
      return 1;
    }
    else if (playerScore >= 500)
    {
      return 2;
    }
    else if (playerScore >= 100)
    {
      return 3;
    }
   return 4;
  }
}
