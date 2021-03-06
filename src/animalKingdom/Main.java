package animalKingdom;

import java.util.List;
import java.util.ArrayList;

public class Main
{
    private static List<AbstractAnimal> filterAnimal(List<AbstractAnimal> animals, CheckAnimals tester)
    {
        List<AbstractAnimal> tempList = new ArrayList<>();

        for (AbstractAnimal a : animals)
        {
            if (tester.test(a))
            {
                tempList.add(a);
            }
        }
        return tempList;
    }
    private static void workWithData()
    {
        System.out.println("Welcome to the animal kingdom!");

        //Mammals(String name, int yearDiscovered)
        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Raccoon", 1758);
        Mammals bigFoot = new Mammals("Big Foot", 2021);

        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catFish = new Fish("Cat Fish", 1817);
        Fish perch = new Fish("Perch", 1758);

        List<AbstractAnimal> animalsList = new ArrayList<>();
        animalsList.add(panda);
        animalsList.add(zebra);
        animalsList.add(koala);
        animalsList.add(sloth);
        animalsList.add(armadillo);
        animalsList.add(raccoon);
        animalsList.add(bigFoot);
        animalsList.add(pigeon);
        animalsList.add(peacock);
        animalsList.add(toucan);
        animalsList.add(parrot);
        animalsList.add(swan);
        animalsList.add(salmon);
        animalsList.add(catFish);
        animalsList.add(perch);

        System.out.println(animalsList);

        System.out.println();
        System.out.println("*** MVP ***");
        System.out.println();
        System.out.println("*** List all the animals in descending order by year named ***");
        animalsList.sort((v1, v2) -> v2.getYear() - v1.getYear());
        animalsList.forEach((a) -> System.out.println(a));

        System.out.println();
        System.out.println("*** List all the animals alphabetically ***");
        animalsList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        animalsList.forEach((a) -> System.out.println(a));

        System.out.println();
        System.out.println("*** List all the animals order by how they move ***");
        animalsList.sort((v1, v2) -> v1.move().compareToIgnoreCase(v2.move()));
        animalsList.forEach((a) -> System.out.println(a));

        System.out.println();
        System.out.println("*** List only those animals that breath with lungs ***");
        List<AbstractAnimal> filteredList = filterAnimal(animalsList, a -> a.breath() == "Lungs");
        filteredList.forEach((a) -> System.out.println(a));

        System.out.println();
        System.out.println("*** List only those animals that breath with lungs and were name in 1758 ***");
        filteredList = filterAnimal(animalsList, a -> (a.breath() == "Lungs") && (a.getYear() == 1758));
        filteredList.forEach((a) -> System.out.println(a));

        System.out.println();
        System.out.println("*** List only those animals that lay eggs and breath with lungs ***");
        filteredList = filterAnimal(animalsList, a -> (a.breath() == "Lungs") && (a.reproduce() == "Eggs"));
        filteredList.forEach((a) -> System.out.println(a));

        System.out.println();
        System.out.println("*** List alphabetically only those animals that were named in 1758 ***");
        filteredList = filterAnimal(animalsList, a -> a.getYear() == 1758);
        filteredList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        filteredList.forEach((a) -> System.out.println(a));

        System.out.println();
        System.out.println("*** Stretch Goal ***");
        System.out.println();
        System.out.println("*** For the list of animals, list alphabetically those animals that are mammals ***");
        filteredList = filterAnimal(animalsList, a -> a instanceof Mammals);
        filteredList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        filteredList.forEach((a) -> System.out.println(a));

    }
    public static void main(String[] args)
    {
        workWithData();
    }
}