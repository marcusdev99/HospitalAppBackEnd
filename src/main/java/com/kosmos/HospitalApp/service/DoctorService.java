package com.kosmos.HospitalApp.service;

import com.kosmos.HospitalApp.entities.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DoctorService {
    List<Doctor> getAllDoctors();
    Doctor saveDoctor(Doctor doctor);
}
