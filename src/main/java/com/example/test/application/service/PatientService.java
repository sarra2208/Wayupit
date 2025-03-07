package com.example.test.application.service;

import com.example.test.application.usecase.*;
import com.example.test.domain.model.Patient;


import java.util.List;
import java.util.Optional;


public class PatientService {
    private final SavePatientUseCase savePatientUseCase;
    private final GetListPatientsUseCase getListPatientsUseCase;
    private final GetPatientUseCase getPatientUseCase;
    private final DeletePatientUseCase deletePatientUseCase;
    private final UpdatePatientUseCase updatePatientUseCase;
    public PatientService(SavePatientUseCase savePatientUseCase,DeletePatientUseCase deletePatientUseCase, GetListPatientsUseCase getListPatientsUseCase, GetPatientUseCase getPatientUseCase,UpdatePatientUseCase updatePatientUseCase) {
        this.savePatientUseCase = savePatientUseCase;
        this.getListPatientsUseCase = getListPatientsUseCase;
        this.getPatientUseCase = getPatientUseCase;
        this.deletePatientUseCase=deletePatientUseCase;
        this.updatePatientUseCase=updatePatientUseCase;

    }

    public Patient savePatient(Patient patient){
        return savePatientUseCase.execute(patient);
    }

    public List<Patient> getListPatients(){
        return getListPatientsUseCase.execute();
    }

    public Optional<Patient> getPatientById(String id){
        return getPatientUseCase.execute(id);
    }
}
