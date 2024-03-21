package com.ebit.whatsappAPI.service;

import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class APIService {
	
	   //s_id = ACCOUNT_SID and token = AUTH_TOKEN
	    private final String s_id = ;
	    private final String token = ;

	    public void sendWhatsAppMessage(String recipient, String message) {
	        Twilio.init(s_id, token);
	        Message.creator(
	                new PhoneNumber("whatsapp:" + recipient),
	                new PhoneNumber("whatsapp:"),
	                message)
	                .create();
	    }
	

}

