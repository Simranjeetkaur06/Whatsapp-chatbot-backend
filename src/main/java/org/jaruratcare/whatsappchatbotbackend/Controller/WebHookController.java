package org.jaruratcare.whatsappchatbotbackend.Controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.jaruratcare.whatsappchatbotbackend.Model.WebHookRequest;
import org.jaruratcare.whatsappchatbotbackend.Service.ChatbotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook")
@Slf4j
public class WebHookController {
    @Autowired
    private ChatbotService chatbotService;
    @PostMapping
    public String handleIncomingWebhook(@Valid @RequestBody WebHookRequest request){
        log.info("RECEIVED MESSAGE -> Sender:{} , Text:{}",
        request.getSender(),request.getMessage());

        return chatbotService.getChatbotResponse(request.getMessage());
    }

}
