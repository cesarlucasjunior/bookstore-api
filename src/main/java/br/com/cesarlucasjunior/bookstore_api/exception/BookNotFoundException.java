package br.com.cesarlucasjunior.bookstore_api.exception;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(Long id) {
        super(buildMessage(id));
    }

    private static String buildMessage(Long id) {
        return String.format("Book with id %d not found", id);
    }
}
