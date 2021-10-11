package com.edts.edts_technical_test.constants.exception;

public class EmployeeException extends RuntimeException {
    private int code;
    private String message;

    public static EmployeeException EmployeeNotFoundException() {
        EmployeeException exception = new EmployeeException();
        exception.code = 404;
        exception.message = "Employee not found";

        return exception;
    }
}
