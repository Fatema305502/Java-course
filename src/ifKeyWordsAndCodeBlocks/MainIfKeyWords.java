package ifKeyWordsAndCodeBlocks;

public class MainIfKeyWords
{
  public static void main(String[] args)
  {
    boolean gameOver=true;
    int score =5000;
    int levelCompleted= 5;
    int bonus= 100;


/*code in block will execute only if condition is true . if we have else in our code
* the code in block will execute only if condition is false. if we have else if : code in block will execute if firstCondition is false and secondCondition is true   */
    if (score ==5000){

      System.out.println("your score was 5000");
    }
//another if statement
    if (score <5000){
      System.out.println("your score was less than 5000");

    }else {
      System.out.println("got here ");
    }

  }
}
