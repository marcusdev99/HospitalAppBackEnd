package com.kosmos.HospitalApp.controller;

import com.kosmos.HospitalApp.entities.Surgery;
import com.kosmos.HospitalApp.service.SurgeryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/surgeries")
@RestController
public class SurgeryController {
    @Autowired
    SurgeryService surgeryService;

    @GetMapping
    public List<Surgery> getAllSurgery(){
        return surgeryService.getAllSugery();
    }

    @PostMapping
    public Surgery saveSurgery(@RequestBody Surgery surgery){
        return surgeryService.saveSurgery(surgery);
    }


}
