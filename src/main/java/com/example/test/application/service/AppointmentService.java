package com.example.test.application.service;

import com.example.test.application.usecase.*;
import com.example.test.domain.model.Appointment;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AppointmentService {
    private final SaveAppointmentUseCase saveAppointmentUseCase;
    private final GetListAppointmentUseCase getListAppointmentUseCase;
    private final GetAppointmentUseCase getAppointmentUseCase;
    private final DeleteAppointmentUseCase deleteAppointmentUseCase;
    private final UpdateAppointmentUseCase updateAppointmentUseCase;


    public AppointmentService(SaveAppointmentUseCase saveAppointmentUseCase, GetListAppointmentUseCase getListAppointmentUseCase, GetAppointmentUseCase getAppointmentUseCase, DeleteAppointmentUseCase deleteAppointmentUseCase, UpdateAppointmentUseCase updateAppointmentUseCase) {
        this.saveAppointmentUseCase = saveAppointmentUseCase;
        this.getListAppointmentUseCase = getListAppointmentUseCase;
        this.getAppointmentUseCase = getAppointmentUseCase;
        this.deleteAppointmentUseCase=deleteAppointmentUseCase;
        this.updateAppointmentUseCase=updateAppointmentUseCase;

    }


    public Appointment saveAppointment(Appointment appointment) {
        return saveAppointmentUseCase.execute(appointment);
    }

    public List<Appointment> getListAppointments() {
        return getListAppointmentUseCase.execute();
    }

    public Optional<Appointment> getAppointmentById(Long id) {
        return getAppointmentUseCase.execute(id);
    }

}
