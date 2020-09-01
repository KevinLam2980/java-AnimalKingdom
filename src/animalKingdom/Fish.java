package animalKingdom;

public class Fish extends AbstractAnimal
{
    public Fish(int num, String name, int yearDiscovered)
    {
        super(num, name, yearDiscovered);
    }

    @Override
    public String move()
    {
        return "Swim";
    }

    @Override
    public String breath()
    {
        return "Gills";
    }

    @Override
    public String reproduce()
    {
        return "Eggs";
    }

}