import java.util.Scanner;
public class patika_deneme {
    public static void main (String[]args){
    double armut =2.14;
    double elma =3.67;
    double domates=1.11;
    double muz = 0.95;
    double patlıcan=5.00;
    double kilo, toplam;
    Scanner  inp = new Scanner(System.in);

        System.out.print("ARMUT KAC KG:");
        kilo = inp.nextDouble();
        System.out.print("ELMA KAC KG:");
        kilo = inp.nextDouble();
        System.out.print("DOMATES KAC KG:");
        kilo = inp.nextDouble();
        System.out.print("MUZ KAC KG:");
        kilo = inp.nextDouble();
        System.out.print("PATLICAN KAC KG:");
        kilo = inp.nextDouble();
        toplam = (armut*kilo)+(elma*kilo)+(domates*kilo)+(muz*kilo)+(patlıcan*kilo);
        System.out.print("TOPLAM TUTARINIZ :  " + toplam);







    }

}
