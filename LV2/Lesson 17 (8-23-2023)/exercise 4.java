class Factorial
{
    public static void main(String args[])
    {
        int n = 5;
           
        System.out.println(getFactorial(n)); 
    }
    
    public static int getFactorial(int n){
        int fact = 1;
        for (int i = 2; i <= n; i++) {
          fact = fact * i;
        }
        return fact;
    }
}

class Main {
  public static void main(String[] args) {
    Factorial.main(args);
  }
}
