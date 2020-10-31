package com.altimetrik.bookcateloguesystem.repo;

import com.altimetrik.bookcateloguesystem.model.BookCatalogue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface BookCatalogueRepo extends CrudRepository<BookCatalogue, Integer> {

    List<BookCatalogue> findByTitle(String title);
    List<BookCatalogue> findByAuthor(String author);
    List<BookCatalogue> findByIsbn(String isbn);

    @Modifying
    @Transactional
    int deleteBookCatalogueByTitle(String title);

    @Modifying
    @Transactional
    int deleteBookCatalogueByIsbn(String isbn);
}
