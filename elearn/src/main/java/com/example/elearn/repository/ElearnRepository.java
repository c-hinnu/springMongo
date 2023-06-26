package com.example.elearn.repository;

import com.example.elearn.model.Elearn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElearnRepository extends JpaRepository<Elearn,Integer> {
}
