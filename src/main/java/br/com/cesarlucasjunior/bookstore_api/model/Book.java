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
    Long id;
    @Column(nullable = false, length = 255)
    String title;
    @Column(nullable = false, length = 255)
    String author;
    @Column(nullable = false, length = 255)
    String publisher;
    @Column(name = "year_publication")
    Integer yearPublication;
    BigDecimal price;
    @Column(name = "cover_url", nullable = false, length = 255)
    String coverUrl;

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
