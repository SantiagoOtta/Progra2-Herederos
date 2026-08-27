import Implementacion.Estrategia_1;
import Interfaces.PilaTDA;

public class SeguimientoDeUnaPila {
    static void main(String[] args) {
        PilaTDA P = new Estrategia_1();

        P.InicializarPila();
        P.Apilar(8);
        P.Apilar(3);
        P.Apilar(12);
        P.Desapilar();
        P.Apilar(7);
        P.Apilar(5);
        System.out.println(P.Tope()); // (a)
        P.Desapilar();
        P.Desapilar();
        System.out.println(P.Tope()); // (b)
        P.Apilar(15);
        System.out.println(P.Tope()); // (c)
    }
}
