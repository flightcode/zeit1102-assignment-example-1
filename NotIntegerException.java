public class NotIntegerException extends Exception { //Exception that is thrown when a string cannot be parsed as an integer.
    NotIntegerException(String s) {
        super(s);
    }
}
