package com.example.interaction.repository;

import com.example.interaction.entity.rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ratingRepository extends JpaRepository<rating, Integer> {
}
