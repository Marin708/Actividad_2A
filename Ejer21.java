import java.io.PrintStream;
import java.util.Scanner;
public class Ejer21 {
    static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner(System.in);
    public static void main (String[]args){
        int num=0;
        screen.println("Ingresar un numero");
        num=keyboard.nextInt();
        if(num==0){screen.println("el numemero es cero");}
        else if(num>0){screen.println("el numero es positivo(+)");}
        else if(num<0){screen.println("El numero es negativo(-)");}
        
    }
}