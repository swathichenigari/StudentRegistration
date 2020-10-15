package com.student.registration.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CentralExceptionHandler extends RuntimeException{

	private static final long serialVersionUID = 6462621365643567271L;

	@ExceptionHandler(value =NoSuchStudent.class)
	public ResponseEntity<Object> NoSuchStudentException(NoSuchStudent exception) {
		return new ResponseEntity<>("Studnet not found", HttpStatus.NOT_FOUND);
	}
	
}
