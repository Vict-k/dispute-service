package com.example.disputes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.disputes.entity.Dispute;

public interface DisputeRepository extends JpaRepository<Dispute, Long>{
    
}
