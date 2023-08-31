class Orange
{
    private int quantity;
    private double price;
  
    public void main(String args[])
    {
        getQuantity(); 
        setQuantity(36);
        getPrice();
        setPrice(23);
    }
    
    public int getQuantity(){
      return quantity;
    }

    public void setQuantity(int q){
      quantity = q;
    }

    public double getPrice(){
      return price;
    }
  
    public void setPrice(double p){
      price = p;
    }
}

class Main {
  public static void main(String[] args) {
    Orange orange = new Orange();
    orange.main(args);
  }
}
