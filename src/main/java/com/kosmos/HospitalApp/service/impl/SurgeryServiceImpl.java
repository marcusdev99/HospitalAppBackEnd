package com.kosmos.HospitalApp.service.impl;

import com.kosmos.HospitalApp.entities.Surgery;
import com.kosmos.HospitalApp.repository.SurgeryRepository;
import com.kosmos.HospitalApp.service.SurgeryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurgeryServiceImpl implements SurgeryService {

    @Autowired
    SurgeryRepository surgeryRepository;
    @Override
    public List<Surgery> getAllSugery() {
        return surgeryRepository.findAll();
    }

    @Override
    public Surgery saveSurgery(Surgery surgery) {
        return surgeryRepository.save(surgery);
    }
}
