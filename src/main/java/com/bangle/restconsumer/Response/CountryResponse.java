package com.bangle.restconsumer.Response;

public class CountryResponse<T> {
    private  Boolean status;
    private T data;

    public CountryResponse ( Boolean status, T data ) {
        this.status = status;
        this.data = data;
    }

    public Boolean getStatus ( ) {
        return status;
    }

    public void setStatus ( Boolean status ) {
        this.status = status;
    }

    public T getData ( ) {
        return data;
    }

    public void setData ( T data ) {
        this.data = data;
    }

    @Override
    public String toString ( ) {
        return "CountryResponse{" +
                "status=" + status +
                ", data=" + data +
                '}';
    }
}
