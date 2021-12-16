package com.example.services;

import javax.transaction.Transactional;

import com.example.models.Ibuhamil;
import com.example.repositories.IbuHamilRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class IbuHamilService {
    
    @Autowired
    private IbuHamilRepository ibuHamilRepository;

    public Ibuhamil createIbuhamil(Ibuhamil ibuhamil){
        return ibuHamilRepository.save(ibuhamil);
    }

    public Iterable<Ibuhamil> findAll(){
        return ibuHamilRepository.findAll();
    }

}
