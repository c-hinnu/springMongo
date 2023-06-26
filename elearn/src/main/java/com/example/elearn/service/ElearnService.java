package com.example.elearn.service;

import com.example.elearn.model.Elearn;
import com.example.elearn.repository.ElearnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ElearnService {
    @Autowired
    private ElearnRepository er;

    public List<Elearn> getall(int id) {
        return er.findAll();
    }

    public void addnewstudent(Elearn elearn) {
        er.save(elearn);
    }
}
