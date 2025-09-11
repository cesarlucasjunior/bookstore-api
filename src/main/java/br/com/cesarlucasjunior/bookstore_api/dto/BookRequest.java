package br.com.cesarlucasjunior.bookstore_api.dto;

import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

public record BookRequest(
        String title,
        String author,
        String publisher,
        Integer yearPublication,
        BigDecimal price,
        MultipartFile coverImage
) {
}
