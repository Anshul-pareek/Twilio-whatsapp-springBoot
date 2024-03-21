package com.ebit.whatsappAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ebit.whatsappAPI.model.APIRequest;
import com.ebit.whatsappAPI.service.APIService;
import com.twilio.twiml.MessagingResponse;
import com.twilio.twiml.messaging.Body;
import com.twilio.twiml.messaging.Message;

@RestController
public class APIController {
	

	
	private final APIService apiService;

    @Autowired
    public APIController(APIService apiService) {
        this.apiService = apiService;
    }

    @PostMapping("/send-whatsapp")
    public ResponseEntity<String> sendWhatsAppMessage(@RequestBody APIRequest request) {
        try {
        	apiService.sendWhatsAppMessage(request.getRecipient(), request.getMessage());
            return ResponseEntity.ok("WhatsApp message sent successfully!");
        } catch (Exception e) {
            e.printStackTrace(); // You might want to handle exceptions more gracefully
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to send WhatsApp message");
        }
    }
	
}
