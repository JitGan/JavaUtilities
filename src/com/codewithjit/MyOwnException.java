package com.codewithjit;

public class MyOwnException extends Exception{

    public MyOwnException(Exception e){
        super(e);
    }
    public MyOwnException(String e){
        super(e);
    }
}
