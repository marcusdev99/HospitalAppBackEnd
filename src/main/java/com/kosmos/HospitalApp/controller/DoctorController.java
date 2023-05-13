package com.kosmos.HospitalApp.controller;

import com.kosmos.HospitalApp.entities.Doctor;
import com.kosmos.HospitalApp.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/doctors")
@RestController
public class DoctorController {
    @Autowired
    DoctorService doctorService;
    @GetMapping
    public List<Doctor> getAllDoctors(){
        return doctorService.getAllDoctors();
    }
    @PostMapping
    public Doctor saveDoctor(@RequestBody Doctor doctor){
        return doctorService.saveDoctor(doctor);

    }
}
