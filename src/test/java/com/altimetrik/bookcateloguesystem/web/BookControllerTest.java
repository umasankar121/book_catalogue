package com.altimetrik.bookcateloguesystem.web;

import com.altimetrik.bookcateloguesystem.model.BookCatalogue;
import com.altimetrik.bookcateloguesystem.repo.BookCatalogueRepo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader= AnnotationConfigContextLoader.class)
@ComponentScan("com.altimetrik.bookcateloguesystem")
@SpringBootTest
public class BookControllerTest {
    @Autowired
    ApplicationContext context;

    @InjectMocks
    BookController bookController;

    @Mock
    BookCatalogueRepo bookCatalogueRepo;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getBookByTitle() {
        Mockito.when(bookCatalogueRepo.findByTitle(Mockito.any())).thenReturn(new ArrayList<>());
        assertNotNull(bookController.getBookByTitle("Austen, Jane"));
    }

    @Test
    public void getBookByAuthor() {
        Mockito.when(bookCatalogueRepo.findByAuthor(Mockito.any())).thenReturn(new ArrayList<>());
        assertNotNull(bookController.getBookByAuthor("Northanger"));
    }

    @Test
    public void getBookByIsbn() {
        Mockito.when(bookCatalogueRepo.findByIsbn(Mockito.any())).thenReturn(new ArrayList<>());
        assertNotNull(bookController.getBookByIsbn("9781593275846"));
    }

    @Test
    public void createBook() {
        Mockito.when(bookCatalogueRepo.save(Mockito.any()))
                .thenReturn(new BookCatalogue());
        assertNotNull(bookController.createBook(new BookCatalogue()));
    }

    @Test
    public void deleteBookByTitle() {
        Mockito.when(bookCatalogueRepo.deleteBookCatalogueByTitle(Mockito.any()))
                .thenReturn(1);
        assertNotNull(bookController.deleteBookByTitle("Austen, Jane"));
    }
    @Test
    public void deleteBookByIsbn() {
        Mockito.when(bookCatalogueRepo.save(Mockito.any()))
                .thenReturn(1);
        assertNotNull(bookController.deleteBookByIsbn("9781593275846"));
    }
}