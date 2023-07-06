package com.example.be.repository;

import com.example.be.entity.ChairType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChairTypeRepository extends JpaRepository<ChairType, Long> {
}
