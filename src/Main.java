import java.util.Scanner;
import Exercise_1_and_2.*;
import Exercise_3.*;


public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //Exercise 1
        /*
        System.out.print("Please insert array length here -----> ");
        int length = scan.nextInt();


        int[] age = new int[length];
        String[] name = new String[length];

        for(int i=0;i<length;i++){
            System.out.print("Number " + (i + 1) + " persons name: ");
            scan.nextLine();
            name[i] = scan.nextLine();

            System.out.print("Number " + (i + 1) + " persons age: ");
            age[i] = scan.nextInt();

            System.out.println("------------");
        }

        Person p = new Person(age, name);
        p.less_then_25();
        */



        ////Exercise 2
        /*
        System.out.print("Please insert array length here -----> ");
        int length = scan.nextInt();


        int[] age = new int[length];
        String[] name = new String[length];
        String[] profession = new String[length];

        for(int i=0;i<length;i++){
            System.out.print("Number " + (i + 1) + " persons name: ");
            scan.nextLine();
            name[i] = scan.nextLine();

            System.out.print("Number " + (i + 1) + " persons age: ");
            age[i] = scan.nextInt();

            System.out.print("Number " + (i + 1) + " persons profession: ");
            scan.nextLine();
            profession[i] = scan.nextLine();


            System.out.println("------------");
        }

        Person p = new Child(age, name, profession);

        Child c = new Child(age, name, profession);

        c.less_then_25();
        */

        //Exercise 3
        /*
        Oceanographer o = new Oceanographer();
        o.checkSound(new Dolphin());
        o.checkSound(new Whale());
        */


    }
}
