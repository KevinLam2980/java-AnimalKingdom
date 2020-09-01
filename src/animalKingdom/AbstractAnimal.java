package animalKingdom;

abstract class AbstractAnimal
{
    private static int maxId = 0;
    protected int id;
    protected String name;
    protected int yearDiscovered;
    protected int food = 0;

    public AbstractAnimal(String name, int yearDiscovered)
    {
        maxId++;
        id = maxId;

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

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getYear()
    {
        return yearDiscovered;
    }

    @Override 
    public String toString()
    {
        return "Animal name: " + name + ", ID: " + id + ", year named: " + yearDiscovered;
    }

}