package com.essem.webvo.response;

import com.essem.exception.ErrorCode;

public class BaseWebResponse<T> {
    private ErrorCode errorCode;
    private T data;

    public BaseWebResponse(){
    }

    public BaseWebResponse(T data){
        this.data=data;
    }

    public BaseWebResponse(ErrorCode errorCode){
        this.errorCode=errorCode;
    }

    public static BaseWebResponse successNoData(){
        return new BaseWebResponse();
    }

    public static <T> BaseWebResponse<T> successWithData(T data){
        return new BaseWebResponse(data);
    }

    public static BaseWebResponse error(ErrorCode errorCode){
        return new BaseWebResponse(errorCode);
    }

}
