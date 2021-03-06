package be.intecbrussel.gameshop.exception;

public class EmptyStockException extends GameException{

    public EmptyStockException() {
    }

    public EmptyStockException(String message) {
        super(message);
    }

    public EmptyStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyStockException(Throwable cause) {
        super(cause);
    }

    public EmptyStockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
