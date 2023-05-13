package com.kosmos.HospitalApp.repository;

import com.kosmos.HospitalApp.entities.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurgeryRepository extends JpaRepository<Surgery, String> {
}
