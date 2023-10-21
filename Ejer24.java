public class Ejer24 extends Base{
    public static void main(String[] args) {
    double estatura1 =0;
    double estatura2 =0;
    double estatura3 =0;
    double estaturaMay =0;
    double estaturaMed =0;
    double estaturaPeq =0;
    double aux=0;
    screen.println (" Ingrese estatura 1 ");
    estatura1 = keyboard.nextDouble();
    screen.println("Ingrese  estatura 2");
    estatura2 = keyboard.nextDouble();
    screen.println("Ingrese estatura 3 ");
    estatura3 = keyboard.nextDouble();
    estaturaMay=estatura1;
    estaturaMed=estatura2;
    estaturaPeq=estatura3;
    if(estaturaPeq>estaturaMed){
    aux=estaturaPeq;
    estaturaPeq=estaturaMed;
    estaturaMed=aux;}
    if(estaturaMed>estaturaMay){
        aux=estaturaMed;
        estaturaMed=estaturaMay;
        estaturaMay=aux;}
    if(estaturaPeq>estaturaMed){
    aux=estaturaPeq;
    estaturaPeq=estaturaMed;
    estaturaMed=aux; }
    screen.println("orden ascendentes de la estatura es: " + estaturaPeq + " , " + estaturaMed + " , " + estaturaMay);
    
    }
}        
