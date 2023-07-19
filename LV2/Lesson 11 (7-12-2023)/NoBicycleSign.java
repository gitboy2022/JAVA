public class NoBicycleSign extends TrafficSign
{
    // private instances
    private static String code = "MUTCD R5-6";
    private static String name = "No bicycle";

    // constructor
    public NoBicycleSign()
    {
        super(name, code);
    }

    // overriden Description method from superclass
    public void Description()
    {
        System.out.println("Name: "+name+"\nCode: "+code);
    }
}
