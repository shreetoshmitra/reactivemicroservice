package com.essem.repository;

public class Author {

    String authorId;
    String authorName;

    public Author(String authorId, String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId='" + authorId + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
