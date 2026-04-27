package com.example.replate.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "food_posts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FoodPost {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "food_posts_seq")
    @SequenceGenerator(name = "food_posts_seq", sequenceName = "food_posts_id_seq", allocationSize = 1)
    private Long id;

    // Food Details
    @Column(name = "food_name", nullable = false, length = 150)
    private String foodName;

    @Enumerated(EnumType.STRING)
    @Column(name = "meal_type", nullable = false, length = 10)
    private MealType mealType;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10)
    private FoodCategory category;

    @Column(nullable = false, length = 100)
    private String quantity;

    // Contact
    @Column(name = "contact_name", nullable = false, length = 100)
    private String contactName;

    @Column(name = "contact_phone", nullable = false, length = 15)
    private String contactPhone;

    @Column(nullable = false, length = 100)
    private String district;

    @Column(nullable = false, length = 500)
    private String address;

    // Status
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 15)
    private FoodPostStatus status;

    // the user who donated the food
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "donor_id", nullable = false)
    private User donor;

    // delivery agent assigned by admin (null until assigned)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assigned_agent_id")
    private User assignedAgent;

    // Audit
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate(){
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
        if(status == null) status = FoodPostStatus.PENDING;
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
}
