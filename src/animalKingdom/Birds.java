package animalKingdom;

public class Birds extends AbstractAnimal
{
    public Birds(int num, String name, int yearDiscovered)
    {
        super(num, name, yearDiscovered);
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