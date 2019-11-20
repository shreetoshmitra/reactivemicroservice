package com.essem.repository;

public class Book {

    private String bookId;
    private String bookTitle;
    private String authorId;

    public Book(String bookId, String bookTitle, String authorId) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.authorId = authorId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthor(String authorId) {
        this.authorId = authorId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookTitle + '\'' +
                ", authorId=" + authorId +
                '}';
    }
}
