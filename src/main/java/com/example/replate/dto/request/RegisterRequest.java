package com.example.replate.dto.request;

import com.example.replate.entity.Role;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class RegisterRequest {
    @NotBlank(message = "Full name is required")
    private String fullName;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;

    @NotBlank(message = "Phone Number is required")
    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid Indian Phone Number")
    private String phoneNumber;

    // Acceptable values: ROLE_USER, ROLE_ADMIN, ROLE_DELIVERY_AGENT
    @NotNull(message = "Role is required")
    private Role role;
}
