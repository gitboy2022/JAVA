public class StopSign extends TrafficSign
{
    // private static instances
    private static String code = "MUTCD R1-1";
    private static String name = "Stop";

    // constructor
    public StopSign()
    {
        super(name, code);
    }

    // overriden Description method from superclass
    public void Description()
    {
        System.out.println("Name: "+name+"\nCode: "+code);
    }
}
