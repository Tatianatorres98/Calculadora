package calculadora;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        Calculadora micalculadora;
        micalculadora = new Calculadora();
        Scanner miescaner = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese opcion");
        opcion = miescaner.nextInt();

        switch (opcion) {
            case 1:
                micalculadora.setX(miescaner.nextDouble());
                micalculadora.setY(miescaner.nextDouble());
                micalculadora.sumar();
                System.out.println("Elresultato es:");
                System.out.println(micalculadora.getR());
                
                break;
            case 2:
                
                micalculadora.setX(miescaner.nextDouble());
                micalculadora.setY(miescaner.nextDouble());
                micalculadora.restar();
                System.out.println("Elresultato es:");
                System.out.println(micalculadora.getR());
                break;
            
        }

    }
}
