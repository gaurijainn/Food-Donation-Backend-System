package com.example.replate.dto.response;

import com.example.replate.entity.FoodCategory;
import com.example.replate.entity.FoodPostStatus;
import com.example.replate.entity.MealType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FoodPostResponse {
    private Long id;
    private String foodName;
    private MealType mealType;
    private FoodCategory category;
    private String quantity;

    // Contact
    private String contactName;
    private String contactPhone;
    private String district;
    private String address;

    // Status
    private FoodPostStatus status;

    // Relations
    private Long donorId;
    private String donorName;
    private Long assignedAgentId;
    private String assignedAgentName;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
