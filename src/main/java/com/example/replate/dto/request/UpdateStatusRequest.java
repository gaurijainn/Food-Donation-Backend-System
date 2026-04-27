package com.example.replate.dto.request;

import com.example.replate.entity.FoodPostStatus;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateStatusRequest {

    @NotNull(message = "Status is required")
    private FoodPostStatus status;
}
