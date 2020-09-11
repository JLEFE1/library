package com.homegrown.library;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookRepository bookRepository;

    BookController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Book>> getAll() {
        var books = bookRepository.findAll();
        return ResponseEntity.ok(books.stream().map(book -> Book.from(book.getTitle(), book.getSubTitle(), book.getRead())).collect(Collectors.toList()));
    }

}
