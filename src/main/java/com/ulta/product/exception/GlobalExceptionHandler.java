package com.ulta.product.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author BrijendraK
 *
 */
@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

	/**
	 * Handling the all exceptions of Exception class.
	 * 
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(value = Exception.class)
	public final ResponseEntity<ErrorDetails> handleException(Exception ex) {
		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(),
				String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()));
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	/**
	 * Handling the all exceptions of ProductException class.
	 * 
	 * @param ex
	 * @return
	 */

	@ExceptionHandler(value = ProductException.class)
	public final ResponseEntity<ErrorDetails> handleException(ProductException ex) {
		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(),
				String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()));
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}