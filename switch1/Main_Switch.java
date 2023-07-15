package switch1;

import java.util.Scanner;

public class Main_Switch {
    public static void main(String[] args) {
        Switch Switch = new Switch();
        Switch switch1 = new Switch();
        Switch switch2 = new Switch();
        switch2.option =1;
        Scanner lector = new Scanner(System.in);
        System.out.println("Type an option");
        switch1.option = lector.nextInt();//si el dato es un String, solo se deja el next, si es un byte, es next byte.
        System.out.println(switch1.showOption());
    }

}
