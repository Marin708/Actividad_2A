public class Ejer26 extends Base {
public static void main(String[] args) {
long pref=0;
long numcel=0;
int temporal=0;
String operador="";
screen.println("ingrese el numero de celular");
numcel=keyboard.nextLong();
pref=numcel/10000000;
temporal=Math.toIntExact(pref);
if((temporal>=310 && temporal<=314)||(temporal>=320)){operador="claro";}
if(temporal>=315 && temporal<=318){operador="movistar";}
if(temporal==319){operador="virgin movil";}
if(temporal==303){operador="uff movil";}
if((temporal>=300&&temporal<=302)||(temporal>=304&&temporal<=305)){operador="tigo";}
screen.println("el operador del celular es: " + operador);
}
    
}
