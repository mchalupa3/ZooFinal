package animals;

import Types.Primate;

/**
 * Write a description of class animals.Ring_Tailed_Lemur here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Ring_Tailed_Lemur extends Primate
{
    // instance variables - replace the example below with your own
    private String age;

    /**
     * Constructor for objects of class animals.Orangutan
     */
    public Ring_Tailed_Lemur()
    {
        super("animals.Ring_Tailed_Lemur", "brown and sometimes mean");
        this.age = "very young";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     *
     */
    @Override
    public String makeNoise()
    {
        // put your code here
        return "screetches and throws feces.";
    }
}