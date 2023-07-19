public class WorkersAhead extends TrafficSign
{
    // private constructor
    private static String code = "MUTCD W21-1";
    private static String name = "Workers ahead";

    // constructor
    public WorkersAhead()
    {
        super(name, code);
    }

    // overriden Description method from superclass
    public void Description()
    {
        System.out.println("Name: "+name+"\nCode: "+code);
    }
}
