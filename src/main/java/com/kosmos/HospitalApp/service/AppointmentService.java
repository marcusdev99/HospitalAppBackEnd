package com.kosmos.HospitalApp.service;

import com.kosmos.HospitalApp.entities.Appointment;

import java.util.List;

public interface AppointmentService {
    List<Appointment> getAllAppointments();
    Appointment saveAppointment(Appointment appointment);

    Appointment findAppointmentBySurgery(String surgery);
}
