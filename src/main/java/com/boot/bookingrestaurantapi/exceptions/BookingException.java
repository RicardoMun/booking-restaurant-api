package com.boot.bookingrestaurantapi.exceptions;

import java.util.List;

import com.boot.bookingrestaurantapi.dtos.ErrorDto;

import java.util.ArrayList;

public class BookingException extends Exception{

    private static final long serialVersionUID = 1L;

    private String code;
    private int responseCode;
    private List<ErrorDto> errorList = new ArrayList<>();

    public BookingException(String code, int responseCode, String message) {
        super(message);
        this.code = code;
        this.responseCode = responseCode;
    }

    public BookingException(String code, int responseCode, String message, List<ErrorDto> errorList) {
        super(message);
        this.code = code;
        this.responseCode = responseCode;
        this.errorList.addAll(errorList);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public List<ErrorDto> getErrorList() {
        return errorList;
    }

    public void setErrorList(List<ErrorDto> errorList) {
        this.errorList = errorList;
    }


}
