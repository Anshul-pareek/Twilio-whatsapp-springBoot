package com.ebit.whatsappAPI.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import com.twilio.Twilio;

import jakarta.annotation.PostConstruct;

@Configuration
public class TwilioConfig {

    @Value("AC46b628ace1ae6da0dc9b7f9e09bc6dcb")
    private String accountSid;

    @Value("4892ecc02f25d63b40d95e6b40f61c0f")
    private String authToken;

    @PostConstruct
    public void initTwilio() {
        Twilio.init(accountSid, authToken);
    }
}

