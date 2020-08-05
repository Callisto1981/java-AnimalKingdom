package theKingdom;

import java.util.ArrayList;

public class Main {

    public static List<Animal> filteredList = new ArrayList<>();

    public static void filterAnimal(List<Animal> animals, CheckAnimal tester)
    {
        filteredList.clear();

        for (Animal a : animals) {
            if (tester.test(a)) {
                filteredList.add(a);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Willkommen");

        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals racoon = new Mammals("Racoon", 1758);
        Mammals bigfoot = new Mammals("BigFoot", 2021);

        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock", 1824);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);
        
        List<Animal> animals = new ArrayList<>();
        animals.add(panda);
        animals.add(zebra);
        animals.add(koala);
        animals.add(sloth);
        animals.add(armadillo);
        animals.add(racoon);
        animals.add(bigfoot);
        animals.add(pigeon);
        animals.add(peacock);
        animals.add(toucan);
        animals.add(parrot);
        animals.add(swan);
        animals.add(salmon);
        animals.add(catfish);
        animals.add(perch);

        System.out.println("List All of the Animals in desc order by year they were named");
        animals.sort((a1, a2) -> a2.getyearNamed() - a1.getyearNamed());
        System.out.print(animals);
        System.out.println();

        System.out.println("List all the Animals by order of movement");
        animals.sort((a1, a2) -> a1.move().compareTo(a2.move()));
        System.out.print(animals);
        System.out.println();

        System.out.println("Animals with Lungs");
        filterAnimal(animals, a -> a.breath().equals("lungs"));
        filteredList.forEach(a -> System.out.println(
            a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getyearNamed()));
            System.out.println();

        System.out.println("Animals with lungs that were named in 1758");
        filterAnimal(animals, a -> (a.breath().equals("lungs")) && (a.getyearNamed() == 1758));
        filteredList.forEach(a -> System.out.println(
            a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getyearNamed()));
            System.out.println();

        System.out.println("Animals that lay eggs and have lungs");
        filterAnimal(animals, a -> (a.breath().equals("lungs")) && (a.reproduce().equals("eggs")));
        filteredList.forEach(a -> System.out.println(
            a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getyearNamed()));
            System.out.println();

        System.out.println("A list of Animals in alphabetical that were named in 1758");
        filterAnimal(animals, a -> a.getyearNamed() == 1758);
        filteredList.sort((a1, a2) -> a1.getName().compareTo(a2.getName()));
        filteredList.forEach(a -> System.out.println(
            a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getyearNamed()));
            System.out.println();
    }

}