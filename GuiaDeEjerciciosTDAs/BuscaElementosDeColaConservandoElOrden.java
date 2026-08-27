import Implementacion.ColaEstatica;
import Interfaces.ColaTDA;
import Interfaces.PilaTDA;
import Implementacion.Estrategia_1;

public class BuscaElementosDeColaConservandoElOrden {
    static void main(String[] args) {

    }
    public static int sumar(ColaTDA c) {
        ColaTDA aux = new ColaEstatica();
        aux.InicializarCola();
        int elemento = 0;
        int acumulador = 0;
        while (!c.ColaVacia()) {
            elemento = c.Primero();
            c.Desacolar();
            aux.Acolar(elemento);
            acumulador = acumulador + elemento;
        }
        while (!aux.ColaVacia()) {
            elemento = aux.Primero();
            aux.Desacolar();
            c.Acolar(elemento);
        }
        return acumulador;
    }
}
