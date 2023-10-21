public class Ejer25 extends Base {

public static void main(String[] args) {
        float alt1=0;
        float alt2=0;
        float alt3=0;
        float alt4=0;
        float altMay=0;
        float altMed=0;
        float altmed=0;
        float altPeq=0;
        float aux=0;     
        //necesito 6 condiciones para resolver este ejercicio guiandome del ejercicio 24
        screen.println("Ingresar la altura de la persona 1");
        alt1=keyboard.nextFloat();
        screen.println("Ingrese la altura de la persona 2");
        alt2=keyboard.nextFloat();
        screen.println("Ingrese la altura de la persona 3");
        alt3=keyboard.nextFloat();
        screen.println("Ingresar la altura de la persona 4");
        alt4=keyboard.nextFloat();
        altMay=alt1;
        altMed=alt2;
        altmed=alt3;
        altPeq=alt4;
        if(altPeq>altmed){
            aux=altPeq;
            altPeq=altmed;
            altmed=aux;}
        if(altmed>altMed){
            aux=altmed;
            altmed=altMed;
            altMed=aux;}
        if(altMed>altMay){
            aux=altMed;
            altMed=altMay;
            altMay=aux;}
        if(altPeq>altmed){
            aux=altPeq;
            altPeq=altmed;
            altmed=aux;}
        if(altmed>altMed){
            aux=altmed;
            altmed=altMed;
            altMed=aux;}
        if(altPeq>altmed){
            aux=altPeq;
            altPeq=altmed;
            altmed=aux;}
        screen.println("Las alturas de las personas en orden ascendente es el siguiente: " + altPeq + " , " + altmed + " , " + altMed + " , " + altMay);
        
    }
}