class Index
{
    public static void main(String args[])
    {
      int[] a = {10, 20, 30 ,40};
      System.out.println(search(20, a ));
    }
    
    public static int search(int n, int[] list) {
      int index = -1;
      for (int i = 0; i < list.length; i++){
        if (list[i] == n){
          index = i;
          break;
        }
      }
      return index;
    }
}

class Main {
  public static void main(String[] args) {
    Index.main(args);
  }
}
