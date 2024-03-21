package com.ebit.whatsappAPI.model;

public class APIRequest {

    private String recipient;
    private String message;
	public APIRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public APIRequest(String recipient, String message) {
		super();
		this.recipient = recipient;
		this.message = message;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "APIRequest [recipient=" + recipient + ", message=" + message + "]";
	}
    
    
}

