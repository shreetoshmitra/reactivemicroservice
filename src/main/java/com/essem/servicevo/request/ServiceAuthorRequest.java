package com.essem.servicevo.request;

public class ServiceAuthorRequest {

    private String authorName;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "ServiceAuthorRequest{" +
                "authorName='" + authorName + '\'' +
                '}';
    }
}
