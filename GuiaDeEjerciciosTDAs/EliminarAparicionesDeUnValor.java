import Implementacion.Estrategia_1;
import Interfaces.ColaTDA;
import Implementacion.ColaEstatica;
import Interfaces.PilaTDA;

public class EliminarAparicionesDeUnValor {
    static void main(String[] args) {

    }
    public static void eliminar(ColaTDA c, int x) {
        int elemento = 0;
        ColaTDA aux = new ColaEstatica();
        aux.InicializarCola();
        while (!c.ColaVacia()) {
            elemento = c.Primero();
            if (c.Primero() == x) {
                c.Desacolar();
            }
            else {
                elemento = c.Primero();
                c.Desacolar();
                aux.Acolar(elemento);

            }
        }
        while (!aux.ColaVacia()) {
            elemento = aux.Primero();
            aux.Desacolar();
            c.Acolar(elemento);
        }
    }
}
