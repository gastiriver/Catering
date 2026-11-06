Java
package ar.edu.unahur.obj2.catering.excepciones;

// Excepción no chequeada: desapilado con pila de historial vacía
public class NadaParaRevertirException extends RuntimeException {
    public NadaParaRevertirException(String mensaje) {
        super(mensaje);
    }
}