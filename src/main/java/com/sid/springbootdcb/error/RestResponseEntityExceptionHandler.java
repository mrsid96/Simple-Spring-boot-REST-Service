package com.sid.springbootdcb.error;

import com.sid.springbootdcb.entity.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DepartmentNotFoundException.class)
    public ResponseEntity<ErrorMessage> departmentNotFoundException(DepartmentNotFoundException departmentNotFoundException, WebRequest request){
        ErrorMessage errorMessage = new ErrorMessage(departmentNotFoundException.getMessage(), HttpStatus.NOT_FOUND, new Date());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
    }
}
