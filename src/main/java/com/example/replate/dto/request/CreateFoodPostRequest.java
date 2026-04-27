package com.example.replate.dto.request;

import com.example.replate.entity.FoodCategory;
import com.example.replate.entity.MealType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CreateFoodPostRequest {

    @NotBlank(message = "Food name is required")
    private String foodName;

    @NotNull(message = "Meal type is required (VEG / NON VEG)")
    private MealType mealType;

    @NotNull(message = "Category is required (RAW / COOKED / PACKED)")
    private FoodCategory category;

    @NotBlank(message = "Quantity is required (e.g. '5 Kg' or '10 persons')")
    private String quantity;

    @NotBlank(message = "Contact Name is required")
    private String contactName;

    @NotBlank(message = "Contact Phone is required")
    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid Indian Phone Number")
    private String contactPhone;

    @NotBlank(message = "District is required")
    private String district;

    @NotBlank(message = "Address is required")
    private String address;
}
