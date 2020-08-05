package theKingdom;

abstract class AbstractAnimals {

    protected static int maxId = 0;
    protected int id;
    protected String name;
    protected int year;


    public AbstractAnimals(String name, int year)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.year = year;

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
        return year;
    }



    abstract String move();

    abstract String breath();

    abstract String reproduce();

    String eat() {
        return "eat";
    }

   @Override
   public String toString() {
       return "Animals{id=" + id + ", name=" + "'" + ", yearNamed=" + year + "}";
   }
}
