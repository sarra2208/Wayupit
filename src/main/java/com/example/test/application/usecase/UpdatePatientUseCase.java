package com.example.test.application.usecase;


import com.example.test.domain.model.Patient;

import com.example.test.domain.repository.PatientRepository;




    public class UpdatePatientUseCase {
        private final PatientRepository patientRepository;

        public UpdatePatientUseCase(PatientRepository patientRepository) {
            this.patientRepository = patientRepository;
        }

        public Patient execute(String id, Patient updatedPatient) {
            return patientRepository.findPatientById(id)
                    .map(existingPatient -> {
                        // Mettre à jour uniquement si l'ID existe
                        existingPatient.setFirstname(updatedPatient.getFirstname());
                        existingPatient.setLastname(updatedPatient.getLastname());
                        existingPatient.setBirthdate(updatedPatient.getBirthdate());
                        existingPatient.setGender(updatedPatient.getGender());
                        existingPatient.setMobile(updatedPatient.getMobile());
                        existingPatient.setEmail(updatedPatient.getEmail());

                        return patientRepository.save(existingPatient);
                    })
                    .orElseThrow(() -> new RuntimeException("⚠️ Patient not found with ID: " + id));
        }
    }