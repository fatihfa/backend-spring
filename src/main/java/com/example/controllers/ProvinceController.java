package com.example.controllers;

import com.example.models.Provinsi;
import com.example.services.ProvinceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/provinces")
public class ProvinceController {
    
    @Autowired
    private ProvinceService provinceService;

    @PostMapping
    public Provinsi createProvinsi(@RequestBody Provinsi provinsi){
        return provinceService.createProvinsi(provinsi);
    }


    @CrossOrigin
    @GetMapping
    public Iterable<Provinsi> findAll(){
        
        return provinceService.findAll();
    }

    @GetMapping("/{id}")
    public Provinsi findById(@PathVariable("id") Long id){
        
        return provinceService.findByOne(id);
    }
}
