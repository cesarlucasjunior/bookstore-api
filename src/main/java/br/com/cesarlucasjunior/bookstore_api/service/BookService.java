package br.com.cesarlucasjunior.bookstore_api.service;

import br.com.cesarlucasjunior.bookstore_api.dto.BookRequest;
import br.com.cesarlucasjunior.bookstore_api.exception.BookNotFoundException;
import br.com.cesarlucasjunior.bookstore_api.model.Book;
import br.com.cesarlucasjunior.bookstore_api.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
    }

    public Book insert(BookRequest bookRequest) {
        Book book = new Book(
                bookRequest.title(),
                bookRequest.author(),
                bookRequest.publisher(),
                bookRequest.yearPublication(),
                bookRequest.price(),
                bookRequest.coverUrl()
        );
        return bookRepository.save(book);
    }

    public void delete(Long id) {
        Book book = getBookById(id);
        bookRepository.delete(book);
    }

    public Book update(Long id, BookRequest bookRequest) {
        Book book = getBookById(id);
        book.setAuthor(bookRequest.author());
        book.setPrice(bookRequest.price());
        book.setTitle(bookRequest.title());
        book.setCoverUrl(bookRequest.coverUrl());
        book.setPublisher(bookRequest.publisher());
        book.setYearPublication(bookRequest.yearPublication());
        return bookRepository.save(book);
    }
}
