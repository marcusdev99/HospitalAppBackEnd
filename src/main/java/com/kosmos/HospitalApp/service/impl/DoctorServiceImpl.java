package com.kosmos.HospitalApp.service.impl;

import com.kosmos.HospitalApp.entities.Doctor;
import com.kosmos.HospitalApp.repository.DoctorRepository;
import com.kosmos.HospitalApp.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;
    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }
}
