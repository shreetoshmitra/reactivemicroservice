package com.essem.repository;

import com.essem.common.fileioutil.FileReader;
import com.essem.common.fileioutil.FileWriter;
import com.essem.servicevo.request.ServiceAuthorRequest;

public class AuthorRepository {

    public String save(ServiceAuthorRequest authorRequest){
        String authorId = getAuthorId();
        Author author = new Author(authorId, authorRequest.getAuthorName());
        FileWriter.write(author);

        return authorId;
    }

    public String getAuthorId(){
        return FileReader.getMaxAuthorId();
    }
}
