package animals;

import animal_qualities.Swimming;

/**
 * Write a description of class animals.Alligator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alligator extends Animal implements Swimming
{
    // instance variables - replace the example below with your own
    private String age;

    /**
     * Constructor for objects of class animals.Orangutan
     */
    public Alligator()
    {
        super("animals.Alligator", "green and slimy scales");
        this.age = "very old";
    }

    @Override
    public String eat() {
        return ("Hella meat and stuff");
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
        return "Growls and roars.";
    }

    @Override
    public String swim() {
        return null;
    }
}
