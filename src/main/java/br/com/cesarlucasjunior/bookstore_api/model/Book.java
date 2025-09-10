package br.com.cesarlucasjunior.bookstore_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "books")
public class Book{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 255)
    private String title;
    @Column(nullable = false, length = 255)
    private String author;
    @Column(nullable = false, length = 255)
    private String publisher;
    @Column(name = "year_publication")
    private Integer yearPublication;
    private BigDecimal price;
    @Column(name = "cover_url", nullable = false, length = 255)
    private String coverUrl;

    public Book(){}

    public Book(String title, String author, String publisher, Integer yearPublication, BigDecimal price, String coverUrl) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearPublication = yearPublication;
        this.price = price;
        this.coverUrl = coverUrl;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public Integer getYearPublication() {
        return yearPublication;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getCoverUrl() {
        return coverUrl;
    }
}
