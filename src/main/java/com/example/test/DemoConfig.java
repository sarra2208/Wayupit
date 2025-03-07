package com.example.test;

import com.example.test.application.service.AppointmentService;
import com.example.test.application.service.PatientService;
import com.example.test.application.usecase.*;
import com.example.test.domain.repository.AppointmentRepository;
import com.example.test.domain.repository.PatientRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;




@Configuration
public class DemoConfig {
    @Bean
    public PatientService patientService(SavePatientUseCase savePatientUseCase,
                                         GetListPatientsUseCase getListPatientsUseCase,
                                         GetPatientUseCase getPatientUseCase,
                                         DeletePatientUseCase deletePatientUseCase,
                                         UpdatePatientUseCase updatePatientUseCase) {
        return new PatientService(savePatientUseCase, deletePatientUseCase, getListPatientsUseCase, getPatientUseCase,updatePatientUseCase);
    }

    @Bean
    public AppointmentService appointmentService (SaveAppointmentUseCase saveAppointmentUseCase,
                                                  GetListAppointmentUseCase getListAppointmentUseCase,
                                                  GetAppointmentUseCase getAppointmentUseCase,
                                                  DeleteAppointmentUseCase deleteAppointmentUseCase,
                                                  UpdateAppointmentUseCase updateAppointmentUseCase){
        return new AppointmentService(saveAppointmentUseCase,getListAppointmentUseCase ,getAppointmentUseCase,deleteAppointmentUseCase,updateAppointmentUseCase);
    }

    @Bean
    public SavePatientUseCase savePatientUseCase(PatientRepository patientRepository) {
        return new SavePatientUseCase(patientRepository);
    }

    @Bean
    public SaveAppointmentUseCase saveAppointmentUseCase(AppointmentRepository appointmentRepository) {
        return new SaveAppointmentUseCase(appointmentRepository);
    }

    @Bean
    public GetListPatientsUseCase getListPatientsUseCase(PatientRepository patientRepository) {
        return new GetListPatientsUseCase(patientRepository);
    }

    @Bean
    public GetListAppointmentUseCase getListAppointmentUseCase(AppointmentRepository appointmentRepository) {
        return new GetListAppointmentUseCase(appointmentRepository);
    }

    @Bean
    public GetPatientUseCase getPatientUseCase(PatientRepository patientRepository) {
        return new GetPatientUseCase(patientRepository);
    }

    @Bean
    public GetAppointmentUseCase getAppointmentUseCase(AppointmentRepository appointmentRepository) {
        return new GetAppointmentUseCase(appointmentRepository);
    }
    @Bean
    public DeleteAppointmentUseCase deleteAppointmentUseCase(AppointmentRepository appointmentRepository){
        return new DeleteAppointmentUseCase( appointmentRepository);
    }
    @Bean
    public DeletePatientUseCase deletePatientUseCase(PatientRepository patientRepository){
        return new DeletePatientUseCase(patientRepository);
    }
    @Bean
    public UpdateAppointmentUseCase updateAppointmentUseCase(AppointmentRepository appointmentRepository){
        return new UpdateAppointmentUseCase(appointmentRepository);
    }
    @Bean
    public UpdatePatientUseCase updatePatientUseCase(PatientRepository patientRepository){
        return new UpdatePatientUseCase(patientRepository);
    }
}