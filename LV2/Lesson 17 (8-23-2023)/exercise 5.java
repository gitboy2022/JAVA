class ChangeString
{
    public static void main(String args[])
    {
        String s = "Hello";
           
        System.out.println(reverseString(s)); 
    }
    
    public static String reverseString(String s){
      String result = "";
      for (int i = 0; i < s.length(); i++) {
        result += s.charAt(s.length() - i - 1);
      }
      return result;
    }
}

class Main {
  public static void main(String[] args) {
    ChangeString.main(args);
  }
}
