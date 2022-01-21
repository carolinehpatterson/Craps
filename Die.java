
/**
 * This class simulates a Die
 *
 * @author Caroline Patterson
 * @version (a version number or a date)
 */
public class Die
{
    private int roll;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
        roll = roll();
    }

    /**
     * The roll method rolls the six-sided die
     *
     * @return    the value of the die roll, an integer 1-6 inclusive
     */
    public int roll()
    {
        // put your code here
        roll = (int) (Math.random() * 6 + 1);
        return roll;
    }
    
    public int getRoll()
    {
        return roll;
    }
}
