import Implementacion.Estrategia_1;
import Interfaces.PilaTDA;

public class BuscaElementoSinModificarPila {

    public static void main(String[] args) {
        PilaTDA P = new Estrategia_1();
        P.InicializarPila();

        P.Apilar(8);
        P.Apilar(3);
        P.Apilar(12);
        P.Desapilar();
        P.Apilar(7);
        P.Apilar(5);

        System.out.println(P.Tope());

        P.Desapilar();
        P.Desapilar();

        System.out.println(P.Tope());

        P.Apilar(15);

        System.out.println(P.Tope());
        System.out.println("Cantidad de elementos: " + cantidadElementos(P));
    }

    static int cantidadElementos(PilaTDA p) {
        PilaTDA aux = new Estrategia_1();
        aux.InicializarPila();

        int count = 0;

        while (!p.PilaVacia()) {
            aux.Apilar(p.Tope());
            p.Desapilar();
            count++;
        }

        while (!aux.PilaVacia()) {
            p.Apilar(aux.Tope());
            aux.Desapilar();
        }

        return count;
    }

    public static boolean contiene(PilaTDA p, PilaTDA aux, int x) {
        int elemento;
        boolean pertenece = false;

        while (!p.PilaVacia() && !pertenece) {
            elemento = p.Tope();

            if (elemento == x) {
                pertenece = true;
            } else {
                p.Desapilar();
                aux.Apilar(elemento);
            }
        }

        while (!aux.PilaVacia()) {
            elemento = aux.Tope();
            aux.Desapilar();
            p.Apilar(elemento);
        }

        return pertenece;
    }
}