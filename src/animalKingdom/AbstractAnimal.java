package animalKingdom;

abstract class AbstractAnimal
{
    protected int num;
    protected String name;
    protected int yearDiscovered;
    protected int food = 0;

    public AbstractAnimal(int num, String name, int yearDiscovered)
    {
        this.num = num;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    abstract String move();
    abstract String breath();
    abstract String reproduce();

    void eat()
    {
        food++;
    }

}