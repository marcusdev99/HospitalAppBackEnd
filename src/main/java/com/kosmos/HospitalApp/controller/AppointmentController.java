package com.kosmos.HospitalApp.controller;

import com.kosmos.HospitalApp.entities.Appointment;
import com.kosmos.HospitalApp.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/appointments")
@RestController
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;

    @GetMapping
    public List<Appointment> getAllAppointsments(){
        return appointmentService.getAllAppointments();
    }

    @GetMapping("/{surgery}")
    public Appointment getAppointmentBySurgery(@PathVariable String surgery){
        return appointmentService.findAppointmentBySurgery(surgery);
    }
    @PostMapping
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        return appointmentService.saveAppointment(appointment);
    }
}
