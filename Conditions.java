import java.util.*;
public class Conditions {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter your name:");
        String name=sc.nextLine();

        System.out.print("enter your age:");
        int age =sc.nextInt();

        boolean  isStudent;
        System.out.println("are you studnet (true/false):");
        isStudent=sc.nextBoolean();


        if(name.isEmpty()){
            System.out.println("you did'nt enter your name!");
        }



        if (age>=65) {
            System.out.println("you are a senior!");
        }
        else if(age>=18){
            System.out.println("You are adult!");
        }  else if (age<0) {
            System.out.println("you haven't been born yet!");

        } else if (age==0) {
            System.out.println("you are a baby!");

        } else {
            System.out.println("you are a child!");
        }


        if(isStudent==true){
            System.out.println("you are a student:");
        }
        else {
            System.out.println("you are not student:");
        }
    }

}
