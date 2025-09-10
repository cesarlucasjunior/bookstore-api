package br.com.cesarlucasjunior.bookstore_api.exception;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record ApiError(
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'") LocalDateTime timestamp,
        Integer status, String error, String message, String path, String code) {

    public ApiError(LocalDateTime timestamp, Integer status, String error, String message, String path, String code) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
        this.code = code;
    }
}
