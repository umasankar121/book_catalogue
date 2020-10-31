package com.altimetrik.bookcateloguesystem.web;

import com.altimetrik.bookcateloguesystem.model.BookCatalogue;
import com.altimetrik.bookcateloguesystem.repo.BookCatalogueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Random;

@RestController
public class BookController {
    private Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    BookCatalogueRepo bookCatalogueRepo;

    @PostMapping(value = "/book/create",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public BookCatalogue createBook(@RequestBody BookCatalogue inputOrder) {
        logger.info("input order received as : {}", inputOrder);
        Random random = new Random();
        inputOrder.setBookId(random.nextInt(100000));
        BookCatalogue savedBook = bookCatalogueRepo.save(inputOrder);
        return savedBook;
    }

    @GetMapping(value = "/book/findBookByTitle/{title}")
    public List<BookCatalogue> getBookByTitle(@PathVariable String title) {
        logger.info("input order received as : {}", title);
       return  bookCatalogueRepo.findByTitle(title);
    }

    @GetMapping(value = "/book/findBookByAuthor/{author}")
    public List<BookCatalogue> getBookByAuthor(@PathVariable String author) {
        logger.info("input order received as : {}", author);
        return  bookCatalogueRepo.findByAuthor(author);
    }

    @GetMapping(value = "/book/findBookByISBN/{isbn}")
    public List<BookCatalogue> getBookByIsbn(@PathVariable String isbn) {
        logger.info("input order received as : {}", isbn);
        return  bookCatalogueRepo.findByIsbn(isbn);
    }

    @DeleteMapping("/book/deleteBookBytitle/{title}")
    public String deleteBookByTitle(@PathVariable String title){
        int deletedRows =  bookCatalogueRepo.deleteBookCatalogueByTitle(title);
        return deletedRows + " rows deleted";
    }

    @DeleteMapping("/book/deleteBookByIsbn/{isbn}")
    public String deleteBookByIsbn(@PathVariable String isbn){
        int deletedRows = bookCatalogueRepo.deleteBookCatalogueByIsbn(isbn);
        return deletedRows + " rows deleted";
    }
}
