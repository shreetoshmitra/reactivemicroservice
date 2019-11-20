package com.essem.service.author;


import com.essem.webvo.request.WebAuthorRequest;
import io.reactivex.Single;

public interface IAuthorService {
    Single<String> addAuthor(WebAuthorRequest authorRequest);
}
