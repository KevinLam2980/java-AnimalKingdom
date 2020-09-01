package animalKingdom;

public class Mammals extends AbstractAnimal
{
    public Mammals(int num, String name, int yearDiscovered)
    {
        super(num, name, yearDiscovered);
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