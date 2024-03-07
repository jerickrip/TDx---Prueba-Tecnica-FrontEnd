package com.pokecrudangular.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class globalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<errorDetails> handlerRNFException(ResourceNotFoundException ex,
                                                            WebRequest wr){
        errorDetails error = new errorDetails(
                                                LocalDateTime.now(),
                                                ex.getMessage(),
                                                wr.getDescription(false),
                                                "NOT FOUND"
                                                );
        return  new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
