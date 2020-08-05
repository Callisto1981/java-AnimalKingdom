package theKingdom;

public class Mammals extends AbstractAnimals {
    

    public Mammals(String name, int year)
    {
        super(name, year);
        //this.name = name;
        //this.name = year;
    }

    @Override
    public String move()
    {
        return "walk";
    }
    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live births";
    }
}