package ar.edu.unahur.obj2.catering.excepciones;

// Excepción no chequeada: porcentaje fuera del rango [0, 100]
public class DescuentoInvalidoException extends RuntimeException {
    public DescuentoInvalidoException(String mensaje) {
        super(mensaje);
    }
}