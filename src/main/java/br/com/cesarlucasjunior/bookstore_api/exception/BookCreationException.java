package br.com.cesarlucasjunior.bookstore_api.exception;

public class BookCreationException extends RuntimeException {

    public BookCreationException(Exception error) { super(buildMessage(error)); }

    private static String buildMessage(Exception error){ return String.format("Error creating book", error); }
}
