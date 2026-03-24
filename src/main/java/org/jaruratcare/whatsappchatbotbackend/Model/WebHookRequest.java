package org.jaruratcare.whatsappchatbotbackend.Model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class WebHookRequest {
    @NotBlank(message="Sender name cannot be Blank")
    private String sender;
    @NotBlank(message="Message text cannot be Blank")
    private String message;
}
