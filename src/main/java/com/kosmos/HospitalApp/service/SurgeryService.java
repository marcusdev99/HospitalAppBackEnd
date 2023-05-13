package com.kosmos.HospitalApp.service;


import com.kosmos.HospitalApp.entities.Surgery;

import java.util.List;

public interface SurgeryService {
    List<Surgery> getAllSugery();

    Surgery saveSurgery(Surgery surgery);
}
