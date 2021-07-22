import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {

        int size;
        String shouldContinue="y";

//nextint den sonra next line kullanirsan calismiyor onun icinn ya next kullanacaksin yada int degeri string e cevireceksin


        // This loop works  as long as   the user answers as Y or y
        while (shouldContinue.equalsIgnoreCase("y")){
            Scanner read=new Scanner(System.in);

            //This code provides to interact with users. it is  getting users choosing
            System.out.println("Welcome to Make Coffee Version 2");
            System.out.println("Enter coffee size");
            System.out.println("1 for small\n" + "2 for Medium\n" + "3 for Large\n");

            size=read.nextInt();
            // This part  is creating a onject from CoffeeServing class
            CoffeeServing coffeeServing=new CoffeeServing(size);
            System.out.println(coffeeServing.createReport());



            System.out.println("is there another order?(Y/N)");
            shouldContinue=read.next();





        }
        System.out.println("Program by YASAR ERKAN");





    }
}
