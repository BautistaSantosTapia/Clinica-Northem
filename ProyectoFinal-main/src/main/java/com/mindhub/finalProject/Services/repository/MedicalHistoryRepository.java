package com.mindhub.finalProject.Services.repository;

import com.mindhub.finalProject.models.MedicalHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory, Long> {
}
