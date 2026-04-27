package com.example.replate.repository;

import com.example.replate.entity.FoodPost;
import com.example.replate.entity.FoodPostStatus;
import com.example.replate.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodPostRepository {
    // All posts created by a specific donor
    List<FoodPost> findAllByDonor(User donor);
    // All posts with a given status
    List<FoodPost> findAllByStatus(FoodPostStatus status);
    // All posts assigned to a specific delivery agent
    List<FoodPost> findAllByAssignedAgent(User agent);
    // All posts by donor ordered by creation date descending
    List<FoodPost> findAllByDonorOrderByCreatedAtDesc(User donor);
}
