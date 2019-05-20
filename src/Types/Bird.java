package Types;

import animals.Animal;
import animal_qualities.Flying;

public class Bird extends Animal implements Flying {

    public Bird(){

        super("Birds", "They flys around in da sky");
    }
    public Bird(String name, String desc){
        super(name, desc);

    }
    public String makeNoise()
    {
        return "Squaring noises";
    }
    public String eat()
    {
        return "worms and seeds ";
    }
    public String fly() {return "FLys around with ease";}
}
