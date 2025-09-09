package br.com.cesarlucasjunior.bookstore_api.service;

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
        return bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Livro não encontrado no bd"));
    }
}
