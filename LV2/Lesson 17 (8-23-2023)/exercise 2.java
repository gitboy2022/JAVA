class ShowFizzBuzz
{
    public static void main(String args[])
    {
        int i = 10;
           
        System.out.println(fizzBuzz(i)); 
    }
    
    public static String fizzBuzz(int i){
      String result = "";
      if (i % 3 == 0) {
          result += "Fizz";
      }
      if (i % 5 == 0) {
          result += "Buzz";
      }
      if (result.equals("")) {
          result = Integer.toString(i);
      }
      return result;
    }
}

class Main {
  public static void main(String[] args) {
    ShowFizzBuzz.main(args);
  }
}
