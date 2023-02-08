package Excepciones;

public class ApilableException extends Exception{
    public ApilableException() {
    }

    public ApilableException(String message) {
        super(message);
    }

    public ApilableException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApilableException(Throwable cause) {
        super(cause);
    }

    public ApilableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
