public class TrafficSign
{
    // private instances
    private String name;
    private String code;

    // constructor
    public TrafficSign(String name, String code)
    {
        this.name = name;
        this.code = code;
    }

    public void Description()
    {
        System.out.println("Sign's description");
    }
}
