package animals;

import animal_qualities.Flying;


/**
 * Write a description of class animals.Alligator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Parrot extends Animal implements Flying
{
    // instance variables - replace the example below with your own
    private String age;

    /**
     * Constructor for objects of class animals.Orangutan
     */
    public Parrot()
    {
        super("animals.Parrot", "colorful feathers");
        this.age = "Kinda young";
    }

    @Override
    public String eat() {
        return ("Worms and seeds");
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
        return "Squaks";
    }



    @Override
    public String fly() {
        return null;
    }
}
