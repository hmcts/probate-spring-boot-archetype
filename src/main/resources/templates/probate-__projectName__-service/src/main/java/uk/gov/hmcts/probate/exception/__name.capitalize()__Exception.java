package uk.gov.hmcts.probate.exception;

public class @name.capitalize()@Exception extends RuntimeException{

    public @name.capitalize()@Exception(String message) {
        super(message);
    }

    public @name.capitalize()@Exception(String message, Throwable cause) {
        super(message, cause);
    }
}
