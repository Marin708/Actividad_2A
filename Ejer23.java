import java.io.PrintStream;
import java.util.Scanner;

public class Ejer23 {
    static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int numLa =0;
        screen.println("Ingresar el número de llantas que desea comprar");
        numLa= keyboard.nextInt();
        if(numLa>=4){screen.println("El valor que debe pagar es " + (numLa*108000));}
        else if(numLa<4){screen.println("El valor que debe pagar es " +(numLa*120000));}
    }
}




