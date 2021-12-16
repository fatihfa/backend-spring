package com.example.services;

import java.util.List;

import javax.transaction.Transactional;

//import com.example.models.Ibuhamil;
import com.example.models.Skrining;
import com.example.repositories.SkriningRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SkriningService {

    @Autowired
    private SkriningRepository skriningRepository;

    public Skrining createSkrining(Skrining skrining) {
        return skriningRepository.save(skrining);
    }

    public Iterable<Skrining> findAll() {
        return skriningRepository.findAll();
    }

    public List<Skrining> finByIbuhamilId(Integer skriningId){

        var skriningList = (List<Skrining>) skriningRepository.finByIbuhamilId(skriningId);
        return skriningList;
    }

    
}
