package com.example.controllers;

import com.example.models.Ibuhamil;
import com.example.services.IbuHamilService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ibuhamils")
public class IbuHamilController {
    

    @Autowired
    private IbuHamilService ibuHamilService;


    @PostMapping
    public Ibuhamil createIbuhamil(@RequestBody Ibuhamil ibuhamil){
        return ibuHamilService.createIbuhamil(ibuhamil);
    }

    @GetMapping
    public Iterable<Ibuhamil> findAll(){
        return ibuHamilService.findAll();
    }
}
