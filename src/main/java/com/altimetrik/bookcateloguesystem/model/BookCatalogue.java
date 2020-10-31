package com.altimetrik.bookcateloguesystem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "BOOK_CATALOGUE")
public class BookCatalogue {
    @Id
    @Column(name = "BOOK_ID")
    private int bookId;
    @Basic
    @Column(name = "TITLE")
    private String title;
    @Basic
    @Column(name = "AUTHOR")
    private String author;
    @Basic
    @Column(name = "ISBN")
    private String isbn;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
