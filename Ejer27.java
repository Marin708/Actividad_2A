public class Ejer27 extends Base{
    public static void main(String[] args) {
        String dateofBirth="";
        String birthday="";
        int birthdayInt=0;
        String zodiacSign="";

        screen.println("Ingrese alguna fecha de nacimiento en el siguiente formato AAAA-MM-DD");
        dateofBirth = keyboard.nextLine();

        birthday = dateofBirth.substring(5,7) + dateofBirth.substring(8,10);

        birthdayInt = Integer.parseInt(birthday);

        if((birthdayInt >= 120 && birthdayInt <=131) || (birthdayInt >= 201 && birthdayInt <= 218))
        zodiacSign="ACUARIO";
        else if((birthdayInt >= 219 && birthdayInt <= 229) || (birthdayInt >= 301 && birthdayInt <= 320))
        zodiacSign="PISCIS";
        else if((birthdayInt >= 321 && birthdayInt <= 331) || (birthdayInt >= 401 && birthdayInt <= 419))
        zodiacSign="ARIES";
        else if((birthdayInt >= 420 && birthdayInt <= 430) || (birthdayInt >= 501 && birthdayInt <= 520))
        zodiacSign="TAURO";
        else if((birthdayInt >= 521 && birthdayInt <= 531) || (birthdayInt >= 601 && birthdayInt <= 620))
        zodiacSign="GEMINIS";
        else if((birthdayInt >=621 && birthdayInt <= 630) || (birthdayInt >= 701 && birthdayInt <=722))
        zodiacSign="CANCER";
        else if((birthdayInt >= 723 && birthdayInt <= 731) || (birthdayInt >= 801 && birthdayInt <= 822))
        zodiacSign="LEO";
        else if ((birthdayInt >= 823 && birthdayInt <= 831) || (birthdayInt >= 901 && birthdayInt <= 922))
        zodiacSign="VIRGO";
        else if((birthdayInt >= 923 && birthdayInt <= 930) || (birthdayInt >= 1001 && birthdayInt <= 1022))
        zodiacSign="LIBRA";
        else if((birthdayInt >= 1023 && birthdayInt <=1031) || (birthdayInt >= 1101 && birthdayInt <= 1121))
        zodiacSign="ESCORPIO";
        else if((birthdayInt >= 1122 && birthdayInt <= 1130) || (birthdayInt >= 1201 && birthdayInt <=1221))
        zodiacSign="SAGITARIO";
        else if((birthdayInt >= 1222 && birthdayInt <= 1231) || (birthdayInt >= 101 && birthdayInt <= 119))
        zodiacSign="CAPRICORNIO";

        if(!zodiacSign.isEmpty()){
        screen.println("Su signo del zodiaco es: " + zodiacSign);}
        else{screen.println("No se pudo determinar su signo del zodiaco");}
        }
    }
     