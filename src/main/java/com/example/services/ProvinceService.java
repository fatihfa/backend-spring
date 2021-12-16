package com.example.services;

import javax.transaction.Transactional;

import com.example.models.Provinsi;
import com.example.repositories.ProvinceRepositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProvinceService {

    @Autowired
    private ProvinceRepositories provinceRepo;

    public Provinsi createProvinsi(Provinsi provinsi) {
        return provinceRepo.save(provinsi);
    }

    public Provinsi findByOne(Long id) {
        return provinceRepo.findById(id).get();
    }

    public Iterable<Provinsi> findAll() {
        return provinceRepo.findAll();
    }

    public void removeOne(Long id) {
        provinceRepo.deleteById(id);
    }

}
