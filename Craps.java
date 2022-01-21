/**
 * This program plays the game of Craps
 *
 * @author Caroline Patterson
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Craps
{
    public static void main(String[] args)
    {
        //Create objects for the game
        Die d1 = new Die();
        Die d2 = new Die();
        Scanner in = new Scanner(System.in);

        while (true)
        {
            //Roll the dice for the first roll
            System.out.println("Let's play Craps!");

            System.out.println("Press [Enter] to roll the dice...");
            in.nextLine();

            int roll1 = d1.roll();
            int roll2 = d2.roll();
            int rollTotal = roll1 + roll2;
            System.out.println("You rolled a " + roll1 + " and a " + roll2);
            System.out.println("for a total of " + rollTotal);
            //Find out if they won?
            if (rollTotal == 7 || rollTotal == 11)
            {
                System.out.println("You won!");
            }
            //Find out if they lost?
            else if(rollTotal == 2 || rollTotal == 3 || rollTotal == 12)
            {
                System.out.println("You lose!");
            }
            //If not win or lose, keep rolling to match the point
            else
            {
                int point = rollTotal;

                boolean keepPlaying = true;

                while(keepPlaying)
                {
                    System.out.println("Press [Enter] to roll the dice...");
                    in.nextLine();

                    roll1 = d1.roll();
                    roll2 = d2.roll();
                    rollTotal = roll1 + roll2;
                    System.out.println("You rolled a " + roll1 + " and a " + roll2);
                    System.out.println("for a total of " + rollTotal);

                    //Did they win? (Math the point)
                    if (rollTotal == point)
                    {
                        System.out.println("You matched your point. You win!");
                        keepPlaying = false;
                    }
                    //Did they lose? (Roll a 7)
                    else if (rollTotal == 7)
                    {
                        System.out.println("You rolled a 7. You lose!");
                        keepPlaying = false;
                    }
                }
                System.out.println("Good game!");
            }
            System.out.println("Wanna play again? (Y/N) ");
            String playAgain = in.nextLine();
            if(playAgain.equals(""))
            {
                //let an empty string pass
            }
            else if (playAgain.substring(0,1).equals("N"))
            {
                break;
            }
        }
        System.out.println("Goodbye, thanks for playing!");
    }
}