package com.ulta.product.exception;

import java.util.Date;

/**
 * 
 * @author BrijendraK
 *
 */
public class ErrorDetails {
	private Date timestamp;
	private String message;
	private String errorCode;

	/**
	 * @param timestamp
	 * @param message
	 * @param errorCode
	 */
	public ErrorDetails(Date timestamp, String message, String errorCode) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.errorCode = errorCode;
	}

	/**
	 * @return
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
}