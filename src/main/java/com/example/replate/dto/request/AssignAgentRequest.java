package com.example.replate.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AssignAgentRequest {

    @NotNull(message = "Delivery Agent ID is required")
    private Long AgentId;
}
