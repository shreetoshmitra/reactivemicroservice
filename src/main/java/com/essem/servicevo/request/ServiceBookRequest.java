package com.essem.servicevo.request;

public class ServiceBookRequest {
    private String bookTitle;
    private String authorId;

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    @Override
    public String toString() {
        return "ServiceBookRequest{" +
                "bookTitle='" + bookTitle + '\'' +
                ", authorId='" + authorId + '\'' +
                '}';
    }
}
