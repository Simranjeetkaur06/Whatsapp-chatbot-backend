package org.jaruratcare.whatsappchatbotbackend.Service;

import org.springframework.stereotype.Service;

@Service
public class ChatbotService {
    public String getChatbotResponse(String incomingText){
        if(incomingText==null || incomingText.trim().isEmpty()){
            return "Oops! It looks like you sent an empty message. Please type 'Hi' to start.";
        }
        if(incomingText.equalsIgnoreCase("Hi")){
            return "Hello Welcome To Jarurat Care.";
        }
        else if(incomingText.equalsIgnoreCase("Bye")){
            return "Good Bye Have a Nice Day!";
        }
        return "Message Received "+ incomingText;
    }
}
