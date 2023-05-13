package com.kosmos.HospitalApp.service.impl;

import com.kosmos.HospitalApp.entities.Appointment;
import com.kosmos.HospitalApp.repository.AppointmentRepository;
import com.kosmos.HospitalApp.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment saveAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment findAppointmentBySurgery(String surgery) {
        return appointmentRepository.findAll().stream()
                .filter(appointment -> appointment.getSurgeryId().equals(surgery))
                .findFirst().orElse(new Appointment());
    }
}
