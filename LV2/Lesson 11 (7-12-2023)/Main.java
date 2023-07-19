class TestDriver
{
    public static void main(String args[])
    {
        // Creating objects of differennt signs
        StopSign s1 = new StopSign();
        NoBicycleSign s2 = new NoBicycleSign();
        WorkersAhead s3 = new WorkersAhead();

        // Printing the description
        s1.Description();
        s2.Description();
        s3.Description();
    }
}

class Main {
    public static void main(String[] args) {
        TestDriver.main(args);
    }
}
