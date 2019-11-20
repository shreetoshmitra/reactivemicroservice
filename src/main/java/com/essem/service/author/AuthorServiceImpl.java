package com.essem.service.author;

import com.essem.webvo.request.WebAuthorRequest;
import io.reactivex.Single;

public class AuthorServiceImpl implements IAuthorService {

    private AuthorServiceImpl authorRepository;

    public Single<String> addAuthor(WebAuthorRequest authorRequest)
    {
        return addAuthorToRepository(authorRequest);
    }

    public Single<String> addAuthorToRepository(WebAuthorRequest authorRequest)
    {
        return Single.create(singleEmitter -> {});
    }
}
