package animalKingdom;

public class Birds extends AbstractAnimal
{
    public Birds(String name, int yearDiscovered)
    {
        super(name, yearDiscovered);
    }

    @Override
    public String move()
    {
        return "Fly";
    }

    @Override
    public String breath()
    {
        return "Lungs";
    }

    @Override
    public String reproduce()
    {
        return "Eggs";
    }

}