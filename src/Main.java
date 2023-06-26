import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        Building building1 = new Building(10,10,10);

        Apartment ap1 = new Apartment(4,3,3,11);
        Penthouse p1 = new Penthouse(10,10,10,10,3,40);
        House h1 = new House(10,4,7,2);

        Building building2 = new House(10,3,1,4);
        Building building3 = new Apartment(3,5,3,1);

//        printWindows(building1);
//        printWindows(ap1);
//        printWindows(h1);
        printWindows(p1);





    }

//    public static void printWindows(Apartment x){
//        System.out.println(x.windows);
//    }
//
//    public static void printWindows(House x){
//        System.out.println(x.windows);
//    }

    public static void printWindows(Building x){
        System.out.println(x.windows);
    }
}





