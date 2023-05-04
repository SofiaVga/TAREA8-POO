import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Main {

    public static void main(String[] args){}

    Cafetera cafetera = new Cafetera(5000, 1000, 1500, 50);
    Scanner sc = new Scanner(System.in);

    int cantidad;
    int opcion = 1;
    boolean cafe = true;
        {
        System.out.println("\n\t1. CAFE AMAERICANO\n\t2. CAFE EXPRESO\n\t3.CAFE CAPUCCHINO");
        System.out.println("\tSELECCIONE SU ORDEN");
        opcion = sc.nextInt();
        System.out.println("\tSELECIONE UNA CANTIDAD");
        cantidad = sc.nextInt();



        switch (opcion) {
            case 1:
                if (cafetera.americano(cantidad) == true) {
                    cafetera.stock();
                    cafe = true;
                } else {
                    cafe = false;
                    cafetera.stock();
                }
                break;
            case 2:
                if (cafetera.expreso(cantidad) == true) {
                    cafetera.stock();
                    cafe = true;
                } else {
                    cafe = false;
                    cafetera.stock();
                }
                break;
            case 3:
                if (cafetera.capuchino(cantidad) == true) {
                    cafetera.stock();
                    cafe = true;
                } else {
                    cafe = false;
                    cafete
                ra.stock();
                }
                break;
            default:
                System.out.println("\terror");
                break;
        }
    }

}



