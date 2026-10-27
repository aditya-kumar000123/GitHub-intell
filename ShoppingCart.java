import java.util.*;
public class ShoppingCart {
    public static void main(String args[]){
        Scanner sc=new  Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency='$';
        double total;

        System.out.print("What item would you like to buy: ");
        item=sc.nextLine();

        System.out.println("What is the price for each: ");
        price=sc.nextDouble();

        System.out.println("How many would you like: ");
        quantity=sc.nextInt();

        total=price*quantity;
        System.out.println("\nyou have bought "+quantity + " "+item +"/s");
        System.out.println("you total is  "+currency +total);


        sc.close();



    }

}
