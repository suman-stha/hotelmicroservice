package com.userservice.exceptions;

public class ResoureNotFoundException extends RuntimeException{
    //extra properties that you want to change

    public  ResoureNotFoundException(){
        super("Resource not found on server!!");
    }public  ResoureNotFoundException(String message){
        super(message);
    }
}
