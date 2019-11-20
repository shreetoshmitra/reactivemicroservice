package com.essem.repository;

import com.essem.common.fileioutil.FileReader;
import com.essem.common.fileioutil.FileWriter;
import com.essem.servicevo.request.ServiceBookRequest;

public class BookRepository {

    public String save(ServiceBookRequest bookRequest){
        String bookId = getBookId();
        Book book = new Book(bookId, bookRequest.getBookTitle(), bookRequest.getAuthorId());
        FileWriter.write(book);

        return bookId;
    }

    public String getBookId(){
        return FileReader.getMaxAuthorId();
    }
}
