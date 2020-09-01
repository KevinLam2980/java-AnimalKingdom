package animalKingdom;

public class Mammals extends AbstractAnimal
{
    public Mammals(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    @Override
    public String move()
    {
        return "Walk";
    }

    @Override
    public String breath()
    {
        return "Lungs";
    }

    @Override
    public String reproduce()
    {
        return "Live births";
    }

}