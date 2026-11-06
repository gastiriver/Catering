package ar.edu.unahur.obj2.catering.excepciones;

// violaciones de invariante de precio
public class PrecioNegativoException extends RuntimeException {
    public PrecioNegativoException(String mensaje) {
        super(mensaje);
    }
}