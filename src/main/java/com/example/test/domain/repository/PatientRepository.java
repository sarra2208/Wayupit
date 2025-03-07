package com.example.test.domain.repository;

import com.example.test.domain.model.Patient;
import com.example.test.infrastructure.persistence.entity.PatientEntity;

import java.util.List;
import java.util.Optional;

public interface PatientRepository {
    Patient save(Patient patient);
    List<Patient> findAllPatients();
    Optional<Patient> findPatientById(String id);

    void deleteById(String id);
    Optional<Patient> findById(String id);

   PatientEntity update(String id, Patient updatedPatient);
}
