public class CoffeeServing {
    private int size;
    private static int SMALL=1;
    private static int MEDIUM=2;
    private  static int LARGE=3;

    //This is constructor  with  parameter
    public CoffeeServing(int size) {
        this.size = size;
    }
    //This is a Default constructor
    public CoffeeServing(){

    }
    //get method for size  variable
    public int getSize() {
        return size;
    }
    // set method for size variable
    public void setSize(int size) {
        this.size = size;
    }
    //This method  is  calculating price   depends on size
    public double calculatePrice(){
        double price;

        if(size==SMALL){
            price=3.25;

        }
        else if(size==MEDIUM){
            price=4.5;


        }
        else if (size==LARGE){
            price=6.00;

        }
        else{
            price=-1;
        }
        return price;

    }
    //This method creating a report .This  report is including coffee kind and price
    public String createReport(){


        String report="";
        double price;
        price=calculatePrice();
        if (size==SMALL){
            report="small coffee $";

        }
        else if(size ==MEDIUM){
            report="medium coffee $";
        }
        else if (size ==LARGE){
            report="large coffee $";
        }
        else {
            report="invalid size selected $";
        }
        return report=report+price;
    }

}
